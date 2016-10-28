package sis.testing;

import java.util.*;
import junit.runner.*;
import junit.framework.*;

public class SuiteBuilder {
	
	public List<String> gatherTestClassesNames (){
		TestCollector collector = new ClassPathTestCollector(){
			
			public boolean isTestClass(String classFileName){
				return super.isTestClass(classFileName);
			}
		};
		return Collections.list(collector.collectTests());
	}
	
}
