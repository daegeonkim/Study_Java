package studentinfo;
import junit.framework.TestCase;
import java.util.*;


public class RosterReportTest extends TestCase {
	
	public void testRosterReport(){
		CourseSession session = new CourseSession("ENG", "101", createDate(2003, 1, 6));
	
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		
		System.out.println(rosterReport);
		assertEquals(RosterReporter.ROSTER_REPORT_HEADER+"A"+RosterReporter.NEWLINE+"B"+
				RosterReporter.NEWLINE+RosterReporter.ROSTER_REPORT_FOOTER+"2"+RosterReporter.NEWLINE,
					rosterReport);
	}

	
	Date createDate(int year, int month, int date){ // Calendar 객체 생성시 더 편하게 작성할수있도록해
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(calendar.YEAR, year);
		calendar.set(calendar.MONTH, month-1);
		calendar.set(calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
		
		
		//ㄴ Calendar 1900, 0부터 시작하는등 가시적으로 좀더 편하게 작성할수있도록 리턴함
		// 그런데 얘가 사용되려면 메소드를 먼저 한번 사용해야하는거아닌가 ..?
		// ㄴ startDate = 에 할당하면된다!
		
	}

}


