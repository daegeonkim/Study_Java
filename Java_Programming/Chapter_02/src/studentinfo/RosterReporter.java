package studentinfo;

import java.util.*;

public class RosterReporter {
	static final String NEWLINE = System.getProperty("Line.separator");
	static final String ROSTER_REPORT_HEADER = "Student"+NEWLINE+"-"+NEWLINE;
	static final String ROSTER_REPORT_FOOTER = NEWLINE +"# Studnet";

	
	
	private CourseSession session; //여기서 객체를 생성하고  //private인 이유는 뭘까
	
	RosterReporter(CourseSession session){ // test 클래스에서 인스턴스화 할
		this.session= session; // 이게 뭐하는걸까 ..
								// test 에서 만든 CourseSession객체를 여기와 연동해주는건가 ??
	}
	
	String getReport(){
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(ROSTER_REPORT_HEADER);
		
		for(Student student:session.getAllStudents()){ //  그냥 Students  를 불러올수는 없나 ???// students는 private로 캡슐화되서 앙
			buffer.append(student.getName());
			buffer.append(NEWLINE);
		}
		
		buffer.append(ROSTER_REPORT_FOOTER+session.getAllStudents().size()+NEWLINE); // 메소드에 메소드를??	
	
		return buffer.toString();
		
	}
	
	
}
