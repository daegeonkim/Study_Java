package sis.search;

import java.net.*;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import sis.util.*;

public class Search {
	
	private URL url;
	private String searchString;
	private int matches;
	private Exception exception = null;
	
	
	public Search (String urlString, String searchString) throws IOException{
		this.url = url;
		this.searchString = searchString;
	}
	
	public String getText(){
		return searchString;
	}

	public String getUrl(){
		return url.toString();
	}
	
	public int matches(){
		return matches;
	}
	
	public boolean errored(){
		return exception != null;
	}
	
	public Exception getError(){
		return exception;
	}
	
	public void execute(){
		try{
			searchUrl();
		}
		catch(IOException e){
			exception = e;
		}
	}
	
	public void searchUrl() throws IOException{
		URLConnection connection = url.openConnection();
		InputStream input = connection.getInputStream();
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new InputStreamReader(input));
			String line;
			while((line = reader.readLine())!= null){
				matches  += StringUtil.occurrences(line, searchString);
			}	
		}finally{
			if(reader != null)
				reader.close();
		}
	}
	
	
}

