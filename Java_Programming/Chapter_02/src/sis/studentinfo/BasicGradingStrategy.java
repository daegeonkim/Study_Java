package sis.studentinfo;

import sis.studentinfo.*;


 public class BasicGradingStrategy implements GradingStrategy{
		@Override
		public int getGradePointsFor(Student.GRADE grade) {
			return grade.getPoints();
	 }
 }
	 
