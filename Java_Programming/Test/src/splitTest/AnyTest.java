package splitTest;

import junit.framework.TestCase;

public class AnyTest{
	public static void main(String[] args) {
		Any test1 = new Any("abc");
		System.out.println(test1.a);
		Any test2  = new Any("ABC");
		System.out.println(test1.a);
		test1.test();
		char a = 'p'+'P';
		System.out.println(a);
	}
}
	
