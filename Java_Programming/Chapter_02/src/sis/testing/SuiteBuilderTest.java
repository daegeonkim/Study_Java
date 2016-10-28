package sis.testing;

import java.util.*;
import junit.framework.TestCase;

public class SuiteBuilderTest extends TestCase{
	public void testGatherTestClassNames(){
		SuiteBuilder builder = new SuiteBuilder();
		List<String> classes = builder.gatherTestClassesNames();
		assertTrue(classes.contains("testing.SuiteBuilderTest"));
		
	}

}
