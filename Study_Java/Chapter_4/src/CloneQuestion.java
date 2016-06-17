
public class CloneQuestion {
//	byte age;
//	String name;
//	boolean isMarried;
//	aa.setAge(100);
//	bb.
//	
//	public byte setAge(byte your_Age){ // 바이트타입의 자료를 리턴해야한다는 오류나오는데 왠지 모르겠음 
//		age = your_Age;
//	}
//	public byte getAge(){
//		return age;			
//	}
//	public String setName(String your_Name){ //스트링 타입의 자료 리턴해야한다고 오류 출력 이유 모
//		name = your_Name;
//	}
//	public String getName(){
//		return name;
//	}
//	public void setMarried(boolean flag){
//		isMarried = flag;
//	}
//	
//	public static void main(String args[]){
//		CloneQuestion profile = new CloneQuestion();
//		profile.setAge(25); //The method setAge(byte) in the type Question is not applicable for the arguments (int)
//		profile.setName("Dennis");
//		profile.setsetMarried(flase); //flase cannot be resolved to a variable
//	}

}
/*
정답 


public class ProfilePrintWithThis {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String[] args) {
		ProfilePrintWithThis profile=new ProfilePrintWithThis();
		byte age=20;
		String name="Min";
		boolean isMarried=true;
		
		profile.setAge(age);
		profile.setName(name);
		profile.setMarried(isMarried);
		
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
	}
	public void setAge(byte age) {
		this.age=age; //this 는 무엇인가, 파이썬에 self 같은건가 갑자기 튀어나왔다
	}
	public byte getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried=isMarried;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
}

*/