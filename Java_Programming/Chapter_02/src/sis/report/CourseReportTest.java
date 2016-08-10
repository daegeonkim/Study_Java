package sis.report;

import static sis.report.ReportConstant.NEWLINE;
import java.util.*;
import junit.framework.*;
import sis.studentinfo.*;

/*
학교는 모든 과목에 대해 보고서가 필요하다
개설학과, 과목번호로 이 보고서를 정렬해야한다
같은 개설 학과 과목은 리스트에 같이 표시됨
개설학과 그룹은 알파벳순으로 표기
같은학과에서 각 과목은 과목번호로 정렬
시작하면서 모든 과목에 대해 간단 보고서를 만든다 ** 지금은 순서를 고려하지않는다.
*/


public class CourseReportTest extends TestCase {
	
	public void testReprot(){
		final Date date= new Date();
		CourseReport report = new CourseReport();
		report.add(create("ENGL", "101", date));
		report.add(create("CZEC", "200", date));
		report.add(create("ITAL", "410", date));
		report.add(create("CZEC", "220", date));
		report.add(create("ITAL", "330", date));
		assertEquals("CAZEC 200"+ NEWLINE+"CZEC 200"+ NEWLINE + "ENGL 101"+NEWLINE+
				"ITAL 330"+ NEWLINE + "ITAL 410"+ NEWLINE, report.text());
		//assertEquals("CZEC 200"+NEWLINE+"ENGL 101"+NEWLINE+"ITAL 410" +NEWLINE, report.text());
	}
	
	private Session create(String name, String number, Date date){
		return CourseSession.create(new Course(name, number), date);
		
	}
	


}
