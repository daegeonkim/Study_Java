package studentinfo;

import java.util.*;


public class DateUtil {
	Date createDate(int year, int month, int date){ // 매개변수로 받은값을 각각 날짜에 지정하는 메소드 
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year); // Calendar.YEAR =  해서 사용하지않는 이유는 뭘까 ??
		calendar.set(Calendar.MONTH,month-1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
				
		
	}
	

}
