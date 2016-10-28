package sis.search;

import java.util.*;
import java.util.concurrent.*;

import com.sun.openpisces.Dasher;

import sis.util.*;



public class Server extends Thread{

	//private List<Search> queue = new LinkedList<>(); // 문제있음
	//ㄴ 콜렉션을 그냥 사용할경우 쓰레드 대해 안전하지 않기 떄문에 아래에 유틸리티 메소드를 이용하여 동기화한다.
	private BlockingQueue<Search> queue = new LinkedBlockingQueue<>();
	private ResultsListener listener;
	static final String START_MSG = "started";
	static final String END_MSG = "finished";
	
	private static ThreadLocal<List<String>> threadLog =
			new ThreadLocal<List<String>>(){
		protected List<String> initialValue(){
			return new ArrayList<String>();
		}
	};
	
	private List<String> completeLog = Collections.synchronizedList(new ArrayList<String>());
	
	public List<String> getLog(){
		return completeLog;
	}
	
	public Server(ResultsListener listener){
		this.listener = listener;
		start(); //?
	}
	
	public void run(){
		while(true){  // 뭐가 참일때일까 
			try{
				execute(queue.take());
			}
			catch(InterruptedException e){
				break;
			}
		}
	}

	public void add(Search search) throws Exception{
		queue.put(search);
	}
	
	private void execute(final Search search){
		new Thread(new Runnable() {
			public void run(){
				log(START_MSG, search);
				search.execute();
				log(END_MSG, search);
				listener.executed(search);
				completeLog.addAll(threadLog.get());
			}
		}).start();
	}
	
	
	private void log(String message, Search search){
		threadLog.get().add(search+ " " + message+ " at " + new Date());
	}
			
	public void shutDown() {
		this.interrupt();
		
	}
	
	
	
}
