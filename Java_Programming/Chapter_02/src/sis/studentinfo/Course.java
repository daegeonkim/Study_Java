package sis.studentinfo;



public class Course {
	private String department;
	private String number;
	
	public Course(String department, String number){
		this.department = department;
		this.number = number;
	}
	
	public String getDepartment(){
		return department;
	}
	public String getNumber(){
		return number;
	}
	
	
	
}
