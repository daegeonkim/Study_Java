package test;

import junit.framework.TestCase;
import java.util.*;

public class ElementsTest extends TestCase{
	
	List<EnumeratorTest> testList1 = new Vector<EnumeratorTest>();
	
	Enumeration<EnumeratorTest> testList2 = ((Vector<EnumeratorTest>) testList1).elements();
	
}
