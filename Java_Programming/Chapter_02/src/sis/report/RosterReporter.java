package sis.report;

import java.util.*;
import sis.studentinfo.*;


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
		wirteHeader(buffer);
		writeBody(buffer);
		writeFooter(buffer);	
		
		return buffer.toString();
	}
	void wirteHeader(StringBuilder buffer){
		buffer.append(ROSTER_REPORT_HEADER);
	}
	void writeBody(StringBuilder buffer){
		for (Student student:session.getAllStudents()){
			buffer.append(student.getName());
			buffer.append(NEWLINE);
		}
	}
	void writeFooter(StringBuilder buffer){
		buffer.append(ROSTER_REPORT_FOOTER+session.getAllStudents().size()+NEWLINE);
		
		
	}
}
