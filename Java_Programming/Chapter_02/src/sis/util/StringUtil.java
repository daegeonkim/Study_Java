package sis.util;

public class StringUtil {

	public static int occurrences(String string, String substring) {
		int occurrence = 0;
		int length = substring.length();
		final boolean ignoreCase = true;
		for (int i =0; i < string.length(); i++){
			if(string.regionMatches(ignoreCase, i, substring, 0, length))
					occurrence ++;
		}
		return occurrence;
	}

}
