package sis.db;

import java.util.*;

import org.omg.CORBA.OBJ_ADAPTER;

import java.io.*;
import java.rmi.server.ObjID;

public class KeyFile {
	private Map<String, EntryData> keys = new HashMap<>();
	private File file;
	
	
	public KeyFile(String filename) throws IOException{
		file = new File(filename);
		if(file.exists()){
			load();
		}
	}
	
	void add(String key, long position, int length){
		keys.put(key, new EntryData(position, length));
	}
	
	int size(){
		return keys.size();
	}
	
	boolean containsKey(String key){
		return keys.containsKey(key);
	}
	
	long getPosition(String key){
		return keys.get(key).getPosition();
	}
	
	int getLength(String key){
		return keys.get(key).getLength();
	}
	
	void close()throws IOException{
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
		stream.writeObject(keys);
		stream.close();
	}
	
	void load()throws IOException{
		ObjectInputStream input = null;
		try{
			input = new ObjectInputStream(new FileInputStream(file));
			try{
				keys = (Map<String, EntryData>) input.readObject();
			}
			catch(ClassNotFoundException e){		
			}
		}
		finally{
			input.close();
		}
	}
	
	static class EntryData implements Serializable{
		private long position;
		private int length;
		
		public EntryData(long position, int length) {
			this.position = position;
			this.length  = length;
		}
		
		private long getPosition(){
			return position;
		}	
		
		private int getLength(){
			return length;
		}
		
	}
}
