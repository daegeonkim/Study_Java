package sis.report;
import junit.framework.TestCase;
import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;
import java.io.*;



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
	
		
		
		System.out.println(rosterReport);
		assertEquals(String.format(RosterReporter.ROSTER_REPORT_HEADER+"A%n"+"B%n"+RosterReporter.ROSTER_REPORT_FOOTER,2), rosterReport);
		assertReportContents(rosterReport);
	}
	
	public void assertReportContents(String rosterReport){
		assertEquals(String.format(RosterReporter.ROSTER_REPORT_HEADER+"A%n"+"B%n"+RosterReporter.ROSTER_REPORT_FOOTER, session.getNumberOfStudents()), rosterReport);
	}
 
}


