package splitTest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import junit.framework.TestCase;
import sun.security.x509.IssuingDistributionPointExtension;

public class Test extends TestCase{
	
	public void testForSkip(){
		StringBuilder builder = new StringBuilder();
		String string =  "123456";
		for (int i =0; i <string.length() ; i +=2){
			builder.append(string.charAt(i));
		
		}
		assertEquals("135", builder.toString());
	}
	public void testCommas(){
		String sequence ="1,2,3,4,5";
		assertEquals(sequence, sequenceUsingDo(1,5));
		assertEquals(sequence, sequenceUsingFor(1,5));
		assertEquals(sequence, sequenceUsingWhile(1,5));
	}

	private String sequenceUsingDo(int start, int stop) {
		StringBuilder builder = new StringBuilder();
		int i = start;
		do{
			if (i>start){
				builder.append(',');	
			}
			builder.append(i);
		} while(++i <= stop);
		return builder.toString();
	}
	
	private String sequenceUsingFor(int start, int stop) {
		StringBuilder builder = new StringBuilder();
		for(int i = start; i<= stop; i++){
			if (i>start){
				builder.append(',');
			}
			builder.append(i);
		}
		return builder.toString();
	}

	private String sequenceUsingWhile(int start, int stop) {
		StringBuilder builder = new StringBuilder();
		int i  = start;
		while(i<=stop){
			if( i > start){
				builder.append(',');
			}
			builder.append(i);	
		i ++;
		}
		
		return builder.toString();
	}
	
	
	//i 값이 start보다 큰 경우 , 를 삽입함.

	
	public static int countChars(String input, char ch){
		int count; 
		int i;
		for (i =0, count =0; i < input.length(); i++)
			if (input.charAt(i) == ch)
				count++;
		return 	count;
		
	}

	
	public static boolean isPalindrome(String string){  //문자열이 앞뒤로 바꿔도똑같은지테스트하는 메소드 // for  뒤에구문에 이상이있어 실행불가함.
		if (string.length() == 0)
			return true;
		int limit = string.length() /2; //?
		for(int forward =0, backward = string.length()-1; forward < limit; forward++, backward--){
			if (string.charAt(forward) != string.charAt(backward))
				return false;
		}
		return true;
	}
	
	public void testPalindrome(){ // 그에 대한 테스트 메소
		assertTrue(isPalindrome("aba"));
	}
	
	private int fib(int x){ // 피보나치 재귀 메소드 // 인수로 받은 값을 0부터 각각 다 더한값을 구함  
		if (x == 0){
			return 0;
		}
		if (x ==1 ){
			return 1;
		}
		return fib(x -1) +fib(x -2); // 계속 메소드 본인을 불러서 반복시킴 // 특정 숫자가 인수가 0이되면 0 을 리턴해서 끝냄
	}

	public void testFib(){ // 피보나치 테스트 메소
		assertEquals(55, fib(10));
	}
	

	
	private String endTrim(String source) { //문자열에 양쪽 끝에 빈 문자를 없애기 위한 메소드
		int i = source.length();
		
		System.out.println(i);
		while(i >= 0){
			if(source.charAt(i-1) != ' ')
				break;
		}
		return source.substring(0, i+1); // api 문서르 참조했으나 뭐라는지 모르겠다 아무튼 인덱스 넘버를 이용하는건데, 왜 +1 을 하는걸까 ..
		
	}
	
	public void testEndTrim(){     // 그에 대한 테스트 메소드 
		assertEquals(" x", endTrim(" x "));
	}



}




