package sis.ui;

import java.io.*;
import junit.framework.TestCase;
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.apple.eawt.AppEvent.SystemSleepEvent;

import sis.studentinfo.*;

public class StudentUITest extends TestCase{
	static private final String name = "Leo Xerces Schomoo";
	
	public void testCreateStudent() throws IOException{
		StringBuffer expectedOutput = new StringBuffer();
		StringBuffer input = new StringBuffer();
		setup(expectedOutput, input);
		byte [] buffer = input.toString().getBytes();
		
		InputStream inputStream =  new ByteArrayInputStream(buffer);
		OutputStream outputStream = new ByteArrayOutputStream();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
		InputStream consoleIn = System.in;
		PrintStream consoleOut = System.out;
		
		System.setIn(inputStream);
		System.setOut(new PrintStream(outputStream));
		try{
			StudentUI ui  = new StudentUI();
			ui.run();
			
			assertEquals(expectedOutput.toString(), outputStream.toString());
			assertStudents(ui.getAddedStudents());	
		}
		finally{
			System.setIn(consoleIn);
			System.setOut(consoleOut);
		}
	}
	
	private String line(String input){ // 입력문자열에개행문자를 붙이는 유틸리티 메소드 
		return String.format("%s%n", input);	
	}
	
	private void setup(StringBuffer expectedOutput, StringBuffer input){
		expectedOutput.append(StudentUI.MENU); // 먼저 사용자에게 메뉴를 보인다.
		input.append(line(StudentUI.ADD_OPTION)); // 사용자가 학생을 추가하기 위한 옵션을 선택해서 응답을 준다.
		expectedOutput.append(StudentUI.NAME_PROMPT);
		input.append(line(name));
		expectedOutput.append(line(StudentUI.ADDED_MESSAGE));
		expectedOutput.append(StudentUI.MENU);
		input.append(line(StudentUI.QUIT_OPTION));		
	}
	
	private void assertStudents(List<Student> students){
		assertEquals(1, students.size());
		Student student = students.get(0);
		assertEquals(name, student.getName());
	}

	public static void main(String[] args) throws IOException {
		new StudentUI().run();
		
	}
	
	
}
