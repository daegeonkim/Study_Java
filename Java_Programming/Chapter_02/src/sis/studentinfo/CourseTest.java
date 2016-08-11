package sis.studentinfo;

import junit.framework.*;
import java.util.*;


public class CourseTest extends TestCase{
	
	public void testCreate(){
		Course course = new Course("CMSC", "120");
		assertEquals("CMSC", course.getDepartment());
		assertEquals("120", course.getNumber());
	}
	public void testEquality(){
		Course courseA = new Course("NURS", "201");
		Course courseAPrime = new Course("NURS", "201");
		//assertEquals(courseA, courseAPrime);		
		
		Course courseB = new Course("ARTH", "330");
		

		assertFalse(courseA.equals(courseB)); // assertEqauls 는 equals 를 이용하는데, Course 클래스에서 이를 각 객체에 필요 필드를 비교하도록 오버라이
		assertEquals(courseA, courseAPrime);	 // **원래는 각 레퍼런스의 주소값을 비교함.(스스로가 스스로와 같은지만 확인이 가능했다.)
		
	//reflexivity (재귀성)
		assertEquals(courseA, courseA);
	//transitivity (타동성?)
		Course courseAPrime2 = new Course("NURS","201");
		assertEquals(courseAPrime, courseAPrime2);
		assertEquals(courseA, courseAPrime2);
	//symetry(대칭성)
		 assertEquals(courseAPrime, courseA);
	//consistency(일관성)
		 assertEquals(courseA, courseAPrime);
	//comparison to null (null값과의 비교)
		 assertFalse(courseA.equals(null));
	//apple & orange
		 assertFalse(courseA.equals("CMSC-120"));
		 
	//containment
		 List<Course> list = new ArrayList<Course>();
		 list.add(courseA);
		 assertTrue(list.contains(courseAPrime)); //해당 배열에 인수가 포함되는지 확인하는메소드 
		 
		 Map<Course, String> map = new HashMap<Course, String>();
		 map.put(courseA, "");
		 //assertTrue(map.containsKey(courseAPrime));
		// System.out.println(courseA.hashCode());
		 //System.out.println(courseAPrime.hashCode());
	}
	public void testHashCode(){
		Course courseA = new Course("NURS", "201");
		Course courseAPrime= new Course("NURS", "201");
		
		Map<Course,String> map = new HashMap<Course, String>();
		map.put(courseA, "");
		assertTrue(map.containsKey(courseAPrime));
		
		assertEquals(courseA.hashCode(), courseAPrime.hashCode());
		//consistancey
		assertEquals(courseA.hashCode(), courseA.hashCode());
	}
	
	public void testHashCodePerformance(){ //해시값 성능에 대한 테스
		final int count = 10000;
		long start = System.currentTimeMillis();
		Map<Course, String> map = new HashMap<Course, String>();
		for(int i=0; i < count; i++){
			Course course = new Course("C"+i, ""+i);
			map.put(course, "");
		}
		
		long stop = System.currentTimeMillis();
		long elapsed = start - stop;
		final long arbitraryThreshold =200; // 적절한 시
		assertTrue("elapsed time = "+elapsed, elapsed<arbitraryThreshold);
		
		
		
		
	}
	
	
	
		
}
