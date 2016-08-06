package sis.studentinfo;

import java.util.*;

import org.omg.CosNaming.NamingContextExtPackage.URLStringHelper;

import java.net.*;

abstract public class Session implements Comparable<Session>, Iterable<Student> {

	private static int count;
	private String department;
	private String number;
	private Vector<Student> students = new Vector<Student>();//new ArrayList<Student>(); // ????
	private Date startDate;
	private int numberOfCredits;
	
	private URL url; //  url 관
	
	
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

/*	double averageGpaForPartTimeStudents(){
		double total = 0.0;
		int count = 0;
		
		for(Student student: students){
			if(student.isFullTime())
				continue;
			count++;
			total += student.getGpa();
		}
		if(count == 0) return 0.0;
		return total / count;
	}*/
	
	double averageGpaForPartTimeStudents(){
		double total = 0.0;
		int count = 0;
	
		/*for(Iterator<Student> it = students.iterator();it.hasNext();){  //이터레이터인터페이스를 이용하여 콜렉션의 각 항목 가져오기  
			Student student = it.next(); //??
			if(student.isFullTime())
				continue;
			count++;
			total += student.getGpa();
		}
		if (count == 0) return 0.0;
		return total / count;
	}*/

		for(Enumeration<Student> it = students.elements();it.hasMoreElements();){
			Student student = it.nextElement(); // 다음자료로포인터를 넘겨줌  
			if(student.isFullTime()){
				continue;
			}
			count++;
			total += student.getGpa();
		}
		if(count ==0) return 0;
		return total/count;
	}
	
	public Iterator<Student> iterator(){
		return students.iterator();
	}

	public void setUrl(String urlString) throws MalformedURLException{
		this.url = new URL(urlString);
		
	}

	public URL getUrl() {
		return url;
	}
	
		
}


		
		
		
		
		
