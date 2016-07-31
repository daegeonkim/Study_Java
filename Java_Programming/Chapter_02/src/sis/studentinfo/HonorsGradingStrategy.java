package sis.studentinfo;

import sis.studentinfo.Student.GRADE;

public class HonorsGradingStrategy extends BasicGradingStrategy implements GradingStrategy{ 
	public int getGradePointsFor(Student.GRADE grade){
		int point = super.getGradePointsFor(grade);
		if (point > 0){
			point += 1;
		}
		return point;
	}
	


}
