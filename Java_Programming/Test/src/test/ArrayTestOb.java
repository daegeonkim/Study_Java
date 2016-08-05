package test;

import java.util.*;

public class ArrayTestOb {
	String name ;
	List<ArrayTestOb> nameList = new ArrayList<ArrayTestOb>();
	
	public ArrayTestOb(String name){
		this.name = name;
	}
	
	public void enroll(ArrayTestOb object){
		nameList.add(object);
	}
	
	public String getName()
	
}
