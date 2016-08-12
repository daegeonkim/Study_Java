package sis.report;

import java.util.*;
import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;
import java.io.*;

public class RosterReporter {
	static final String ROSTER_REPORT_HEADER = "Student%n-%n";
	static final String ROSTER_REPORT_FOOTER = "%n# students = %d%n";  //??
	
	
	
	private Session session; //여기서 객체를 생성하고  //private인 이유는 뭘까
	private Writer writer;
	
	RosterReporter(Session session){ // test 클래스에서 인스턴스화 할
		this.session= session; // 이게 뭐하는걸까 ..
								// test 에서 만든 CourseSession객체를 여기와 연동해주는건가 ??
	}
	
	void writeReport(Writer writer) throws IOException{
		this.writer = writer;
		wirteHeader();
		writeBody();
		writeFooter();
	}
	
	
	/*String getReport(){
		StringBuilder buffer = new StringBuilder();
		wirteHeader(buffer);
		writeBody(buffer);
		writeFooter(buffer);	
		
		return buffer.toString();
	}*/
	void wirteHeader() throws IOException{
		writer.write(String.format(ROSTER_REPORT_HEADER));
	}
	void writeBody() throws IOException {
		for (Student student:session.getAllStudents()){
			writer.write(String.format(student.getName()+NEWLINE));
		}
	}
	void writeFooter() throws IOException {
		writer.write(String.format(ROSTER_REPORT_FOOTER, session.getAllStudents().size()));	
	}
	
}
