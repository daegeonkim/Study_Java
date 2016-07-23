package sis.studentinfo;

public class Student { //다른 패키지에서 import 해서 참조할수있도록  public 으로 접근제어자를 변경한다.
	

	private String	name;
	
	public Student(String name) {
		this.name = name;
	}
	
	
	public String getName(){
		return name;
	}
}
