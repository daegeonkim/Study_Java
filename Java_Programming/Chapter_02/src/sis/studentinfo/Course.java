package sis.studentinfo;



public class Course {
	String department;
	 String number;
	
	public Course(String department, String number){
		this.department = department;
		this.number = number;
	}
	
	public String getDepartment(){
		return department;
	}
	public String getNumber(){
		return number;
	}
	
	@Override
	public boolean equals(Object object){
		if(object == null){
			return false;
		}
		if(! (object instanceof Course)){
			return false;
		}
		Course that = (Course)object;
		return 
				this.department.equals(that.department) &&
				this.number.equals(that.number); 
	}

	@Override // 각 객체의 인스턴스값으로 해쉬코드를 구성하게 오버라이드함.
	public int hashCode(){  // 기본으로 비교할경우 객체의 고유 해시코드를 비교하기때문에, 그안에 값이 같은지 확인할수없
		final int hashMultiplier = 41;  
		int result = 7;
		result = result * hashMultiplier + department.hashCode(); // 필드의 해시코드 크기를 해시코드화 하도록 오버라이드해서 
		result = result * hashMultiplier + number.hashCode(); // 같은지 비교 가능하게한
		return result;
	}
	@Override
	public String toString(){
		return department+" "+number;
	}
	
	
}
