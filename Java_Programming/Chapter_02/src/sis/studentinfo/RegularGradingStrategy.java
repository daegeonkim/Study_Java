package sis.studentinfo;

import sis.studentinfo.Student.GRADE;

public class RegularGradingStrategy implements GradingStrategy{

	public int getGradePointsFor(Student.GRADE grade){
		if(grade == GRADE.A) return 4;
		if (grade == GRADE.B) return 3;
		if (grade == GRADE.C) return 2;
		if (grade == GRADE.D) return 1;
		return 0;
	}
	
	
	
}

