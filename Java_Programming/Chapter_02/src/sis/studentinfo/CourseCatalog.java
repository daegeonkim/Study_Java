package sis.studentinfo;

import java.util.*;
import java.io.*;

public class CourseCatalog {
	
	private List<Session> sessions = new  ArrayList<Session>();
	
	
	
	public void add(Session session){
		sessions.add(session);
	}
	
	public List<Session> getSessions(){
		return sessions;
	}
	
	public void clearAll(){
		sessions.clear();
	}
	
	public void store(String filename) throws IOException{
		ObjectOutputStream output = null;
		try{
			output = new ObjectOutputStream(new FileOutputStream(filename));
			output.writeObject(sessions);
		}
		finally{
			output.close();
		}
	}
	
	
	
	// 위에 같은  store 메소드 데이터스트림 >  객체스트림으로  개편하기 전 데이터스트림 내용인데 어떤 차이점이있는지 잘 모르겠다.
	/*public void store(String filename) throws IOException{ // 이건 어디서 예외가 발생하는거지 ??? 
		DataOutputStream output = null;
		try{
			output = new DataOutputStream(new FileOutputStream(filename));
			output.writeInt(sessions.size());
			for(Session session : sessions){
				output.writeLong(session.getStartDate().getTime());
				output.writeInt(session.getNumberOfCredits());
				output.writeUTF(session.getDepartment());
				output.writeUTF(session.getNumber());
			}
		}
		finally{
			output.close();
		}
	}*/
	
	
	
	public void load(String filename) throws IOException, ClassNotFoundException{
		ObjectInputStream input = null;
		try{
			input = new ObjectInputStream(new FileInputStream(filename));
			sessions = (List<Session>)input.readObject();
	
		}
		finally{
			input.close();
		}
		
		
	}
	
	
	
	//데이터스트림 > 객체스트림 중 데이터스트
	/*public void load(String filename) throws IOException{
		DataInputStream input = null;
		try{
			input = new DataInputStream(new FileInputStream(filename));
			int numberOfSessions=input.readInt();
			for(int i = 0; i < numberOfSessions; i++){
				Date startDate  = new Date(input.readLong());
				int credits = input.readInt();
				String department = input.readUTF();
				String number = input.readUTF();
				Course course = new Course(department, number);
				Session session = CourseSession.create(course, startDate);
				session.setNumberOfCredits(credits);
				sessions.add(session);
			}
		}
		finally{
			input.close();
		}
	}*/
	
	
	
}
