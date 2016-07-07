package Question;

public class ManageStudent {
	public static void main(String[] args) {
		ManageStudent aa = new ManageStudent ();
		Student[]student=null;
		student = aa.addstudent();
		aa.printStudents(student);
		System.out.println("------------------");
		aa.checkEquals();
	}
	
	public void printStudents(Student [] student){ // student 가 배열이기때문에 매개변수도 배열
		for(Student a:student){ // 이게문제인데 .. 객체가 메소드리턴값이면안되는건가 ??
								//배열 안에 생성자 ?? DTO값이 들어있기때문에 안되는듯 이것을 for  로 어떻게풀어야하나
								//매개변수안에  위에서 선언한 student (=aa.addstudent) 말고Student[]student 가 들어가야하는 이유는뭘까
								// 메소드에서 리턴된값이 배열이라 그런걸까 ?
			System.out.println(a);
		}
	}
	
	public Student[] addstudent(){ //Student[] ???
		Student[]  student = new Student[3];
		student[0] = new Student("Lim"); // 배열이 왜나오지
		student[1] = new Student("min");
		student[2] = new Student("sook","seoul","01066075086","ask@godofjava.com"); // 배열안에 이렇게 여러개 값을 넣을수있었나.. 2차원인가 ??
		return student;
		
	}
	
	public void checkEquals(){
		Student a = new Student("name", "seoul", "number", "email");
		Student b = new Student("name", "seoul", "number", "email");
		if (a.equals(b)){
			System.out.println("same");
		} else{
			System.out.println("Different");
		}
	} 
	
}
