package splitTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private List<String> tokenize(String string){
		List<String> results = new ArrayList<String>();
		
		
		StringBuffer word = new StringBuffer();
		int index = 0;
		
		while(index<string.length()){
			char ch = string.charAt(index);
			if (ch != ''){
				word.append(ch);
			}
			else{
				if (word.length() > 0 ){
					results.add(word.toString())
					word = new StringBuffer(); // ??
					}
				index++;}
			}
		if (word.length() > 0 ){
			results.add(word.toString());
			return reults;
		}
		
		
		
	}

}
