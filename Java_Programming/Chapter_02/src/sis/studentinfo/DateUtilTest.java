package sis.studentinfo;

import java.util.*;
import junit.framework.TestCase;;


public class DateUtilTest extends TestCase{
	public void testCreateDate(){
		Date date = DateUtil.createDate(2000, 1, 1); // 이거슨 또 무엇일
		Calendar calendar = new GregorianCalendar(); // ㅇ? 타입과 생성자가다르다 ??
		calendar.setTime(date);
		assertEquals(2000, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
	}
}
