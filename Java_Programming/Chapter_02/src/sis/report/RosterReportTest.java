package sis.report;
import junit.framework.TestCase;
import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;
import java.io.*;

import com.sun.javafx.binding.StringFormatter;



public class RosterReportTest extends TestCase {
	
	private Session session;
	
	protected void setUp(){
		session = CourseSession.create(new Course("ENGL", "101"),DateUtil.createDate(2003, 1, 6));
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
	}

	
	public void testRosterReport() throws IOException{
		Writer writer = new StringWriter();
		new RosterReporter(session).writeReport(writer);
		String rosterReport = writer.toString();
	
		
		
		//System.out.println(rosterReport);
		assertEquals(String.format(RosterReporter.ROSTER_REPORT_HEADER+"A%n"+"B%n"+RosterReporter.ROSTER_REPORT_FOOTER,2), rosterReport);
		assertReportContents(rosterReport);
	}
	
	public void assertReportContents(String rosterReport){
		assertEquals(String.format(RosterReporter.ROSTER_REPORT_HEADER+"A%n"+"B%n"+RosterReporter.ROSTER_REPORT_FOOTER, session.getNumberOfStudents()), rosterReport);
	}
 
	public void testFiledReport() throws IOException{ // 파일에 내용 저장과 불러오기에 대한 테스트 
		
		final String filename = "testFiledReport.txt"; // 파일이름  
		try{
			delete(filename);
			
			new RosterReporter(session).writeReport(filename);
			
			StringBuffer buffer = new StringBuffer();
			String line;
			
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while((line = reader.readLine()) != null){ // 중괄호는 왜 두개일까 앞에 코드가 먼저 실행되기 위해서 ???  
				buffer.append(String.format(line+ "%n"));
			}
			reader.close();
		
			assertReportContents(buffer.toString());
		}
		finally{
			delete(filename);
		}
		
	}
	
	private void delete(String filename){
		File file = new File(filename);
		if (file.exists()){
			assertTrue("unable to delete "+filename, file.delete());
		}
	}
}


