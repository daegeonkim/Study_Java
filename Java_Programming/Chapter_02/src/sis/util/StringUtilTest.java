package sis.util;

import junit.framework.TestCase;

public class StringUtilTest extends TestCase{
	private static final String TEXT = "this is it, isnt it";
	
	public void testOccurrencesOne(){
		assertEquals(1, StringUtil.occurrences(TEXT, "his"));
	}
	
	public void testOccurrencesNone(){
		assertEquals(0, StringUtil.occurrences(TEXT, "smelt"));
	}
	
	public void testOccurrencesMany(){
		assertEquals(3, StringUtil.occurrences(TEXT, "is"));
		assertEquals(2, StringUtil.occurrences(TEXT, "it"));
	}
	
	public void testOccurrencesSearchStringTooLarge(){
		assertEquals(0, StringUtil.occurrences(TEXT, TEXT+"sdfas"));
	}

}
