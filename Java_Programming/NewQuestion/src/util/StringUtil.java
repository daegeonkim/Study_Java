package util;

public class StringUtil {
	
	private static final String NEWLINE = System.getProperty("line.separator");
		
	private StringUtil(){
		//private 로 선언해서 유틸리티 클래스로 표시한다.  
	}
	
	public static String appendNewLine(String string) {
		
		return string+NEWLINE;
	}
	
}
