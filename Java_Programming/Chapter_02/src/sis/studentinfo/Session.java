package sis.studentinfo;

import java.util.*;

abstract public class Session implements Comparable<Session> {

	private static int count;
	private String department;
	private String number;
	private List<Student> students = new ArrayList<Student>(); // ????
	private Date startDate;
	private int numberOfCredits;
	
	protected Session(String department, String number, Date startDate){ // 생성자 
		this.department = department;
		this.number= number;
		this.startDate = startDate;
	}
	
	@Override
	public int compareTo(Session that) {
		int compare = this.getDepartment().compareTo(that.getDepartment());
		if (compare!= 0){
			return compare;
		}
		return this.getNumber().compareTo(that.getNumber());
	}
	
	void setNumberOfCredits(int numberOfCredits){
		this.numberOfCredits = numberOfCredits;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String getNumber(){
		return number;
	}
	
	public int getNumberOfStudents(){
		return students.size();
	}

	public void enroll(Student student){
		student.addCredits(numberOfCredits);
		students.add(student);
	}

	Student get(int index){
		return students.get(index);
	}

	protected Date getStartDate(){
		return startDate;
	}

	public List<Student> getAllStudents(){ // 얘는 뭐하는애지
		return students;
	}

	abstract protected int getSessionLength();
	
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(getStartDate());
		final int daysInWeek = 7;
		final int daysFromFridaytoMonday = 3; 
		int numberOfDays = getSessionLength()*daysInWeek-daysFromFridaytoMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}



}
