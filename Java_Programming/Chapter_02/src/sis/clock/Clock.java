package sis.clock;

import java.util.*;

public class Clock implements Runnable{
	
	private ClockListener listener;
	private boolean run = true;
	
	
	public Clock(ClockListener listener){
		this.listener = listener;
	}
	
	public void stop(){
		run = false;
		
	}
	@Override
	public void run() {
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY -1);
		long lastTime = System.currentTimeMillis();
		while(run){
			try{Thread.sleep(10);}
			catch (InterruptedException e){	}
			long now = System.currentTimeMillis();
			if((now /1000) - (lastTime / 1000) >= 1){
				listener.update(new Date(now));
				lastTime = now;
			}
		}
	}
	
	

}
