package sis.studentinfo;

import java.util.*;

import org.omg.CosNaming.NamingContextExtPackage.URLStringHelper;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.net.*;

abstract public class Session implements Comparable<Session>, Iterable<Student>, java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	private String name;
	private static int count;
	private String department;
	private String number;
	private transient List<Student> students = new ArrayList<>(); // 제외하는데 왜지 제발 왠지알랴줭 ...
	// vector 로 선언하고 마무리되었는데 이후 내용진행을위해 ArrayList 로 변경하고 averageGpa 메소드 변경함 / 변경전 메소드주석처리
	private Date startDate;
	private int numberOfCredits;

	
	//private transient String name; // 직렬화 이후 새로운 클래스 정의시 예외발생의 테스트에 대한 필드
	//  직렬화 이후, 클래스의 내용이 변경(필드가 추가되거나등) 이 있을 경우 직렬화된 이후 클래스 정의를 바꾸면 직렬화된 객체를 읽을때 예외가 발생한다.
	
	
	private Course course;
	
	private URL url; //  url 관
	
	
	protected Session(Course course, Date startDate){ // 생성자 
		this.course = course ; 
		this.startDate = startDate;
	}
	
	abstract protected int getSessionLength();
	
	
	
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
		return course.getDepartment();
	}
	
	public String getNumber(){
		return course.getNumber();
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
	
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(getStartDate());
		final int daysInWeek = 7;
		final int daysFromFridaytoMonday = 3; 
		int numberOfDays = getSessionLength()*daysInWeek-daysFromFridaytoMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	double averageGpaForPartTimeStudents(){
		double total = 0.0;
		int count = 0;

		for(Student student : students){
			if(student.isFullTime()){
				continue;
			}
			count++;
			total += student.getGpa();
		}
		if(count ==0) return 0;
		
		
		return total/count;
	}
	
	
/*	double averageGpaForPartTimeStudents(){ // 변경전 ( students vector 로 선언된 내용에 대한 평균값 구하는 메소드 )
		double total = 0.0;
		int count = 0;

		for(Enumeration<Student> it = students.elements();it.hasMoreElements();){
			Student student = it.nextElement(); // 다음자료로포인터를 넘겨줌  
			if(student.isFullTime()){
				continue;
			}
			count++;
			total += student.getGpa();
			System.out.println(count +"'s is"+total);
		}
		if(count ==0) return 0;
		System.out.println("Average is "+total);
		
		
		return total/count;
	}*/
	
	
	
	
	public Iterator<Student> iterator(){
		return students.iterator();
	}

	public void setUrl(String urlString) throws SessionException{
		try{
			this.url = new URL(urlString);
		}
		catch(MalformedURLException e){
			log(e);
			throw new SessionException();
		}
		
	}

	public URL getUrl() {
		return url;
	}
	
	private void log(Exception e){
		// 더 뒤에 레슨에서 작성 예
	}

	public int getNumberOfCredits() {

		return numberOfCredits;
	}	
	
}


		
		
		
		
		

