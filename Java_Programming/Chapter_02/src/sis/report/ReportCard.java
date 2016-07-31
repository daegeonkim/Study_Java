package sis.report;

import java.util.*;
import sis.studentinfo.*;



public class ReportCard {
	static final String A_MESSAGE = "The Grade is A";
	static final String B_MESSAGE = "The Grade is B";
	static final String C_MESSAGE = "The Grade is C";
	static final String D_MESSAGE = "The Grade is D";
	static final String F_MESSAGE = "The Grade is F";
	
	
	private Map<Student.GRADE, String> messages = null; // 늦은 초기
	
	public String getMessage(Student.GRADE grade){
		return getMessages().get(grade); // 읭
	}
	
	private Map<Student.GRADE, String> getMessages(){
		if(messages == null){
			loadMessages();
		}
		return messages;
	}
	
	private void loadMessages(){
		messages = new EnumMap<Student.GRADE, String>(Student.GRADE.class);
		messages.put(Student.GRADE.A, A_MESSAGE);
		messages.put(Student.GRADE.B, B_MESSAGE);
		messages.put(Student.GRADE.C, C_MESSAGE);
		messages.put(Student.GRADE.D, D_MESSAGE);
		messages.put(Student.GRADE.F, F_MESSAGE);	
		}
}
