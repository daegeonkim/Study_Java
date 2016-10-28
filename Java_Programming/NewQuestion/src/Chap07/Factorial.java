package Chap07;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class Factorial {
	
	public String test2(int n){
		int a = 0;
		String b = "";
		while(a < n){
			a++;
			b = b+" " + String.valueOf(a);
			if(a%5 == 0) b= b+"*";
			
		}
		return b;
	}

 
	public Vector<String> split(String line){
		Vector<String> result = new Vector<>();
		StringTokenizer tokenizer = new StringTokenizer(line, " ");

		while (tokenizer.hasMoreTokens()) {
			result.add(tokenizer.nextToken());
		}
		return result;
		
	}
	
}
