package sis.report;


import java.util.*;
import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;

/*
학교는 모든 과목에 대해 보고서가 필요하다
개설학과, 과목번호로 이 보고서를 정렬해야한다
같은 개설 학과 과목은 리스트에 같이 표시됨
개설학과 그룹은 알파벳순으로 표기
같은학과에서 각 과목은 과목번호로 정렬
시작하면서 모든 과목에 대해 간단 보고서를 만든다 ** 지금은 순서를 고려하지않는다.

*/



public class CourseReport {
	private ArrayList<CourseSession> sessions = new ArrayList<>();
	
	public void add(CourseSession session){  // 학과 정보를 학과정보 관리 배열리스트에 추가하는메소
		sessions.add(session);
	}

	public String text (){
//		java.util.Collections.sort(session); // sort 기능을사용하려면 객체가 java.lang.Comparable 지정되어있어야하는데 Coursession은 그렇지 않아 오류 발생	
											// String 의 경우 String  클래스를 확인해보면 CompareTo 인터페이스를 구현하고있어 가능하다고한다.
		
		StringBuilder builder = new StringBuilder();  // 빌더를 만들
		for (CourseSession session :sessions){ // 빌더에 위에 배열리스트에 추가한 과목들을 for으로 학과명, 번호를 빌더에 추가하
			builder.append(session.getDepartment()+" "+session.getNumber()+NEWLINE);
		}
		System.out.println(builder.toString());

		return builder.toString(); //  String 형으로 내보냄
		
		
	}
}
