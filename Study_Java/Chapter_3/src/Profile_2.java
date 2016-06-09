
public class Profile_2 {
	String name;
	int age;	
	public static void main(String args[]){
		Profile_2 me = new Profile_2();
		me.setName("Dennis");
		me.setAge(10);
		System.out.println("My Name Is "+me.printName());
		System.out.println("My Age Is "+me.printAge());
	}
	public void setName(String str){
		name = str;
	}
	public void setAge(int var){
		age = var;	
	}
	public int printAge(){
		return age;
	}
	public String printName(){
		return name;
	}
}
// 크 정답을 맞춰냄

/* 이유는 printAge, Name 메소드에 값을 리턴해야하늗네 void 리턴타입을 줘서 리턴을 할수없어서, 리턴값이 없어서오류 출력됨.
 그래서 지원할수없는, 사용할수없는, 이런식의 메시지가 출력된것으로 추정함*/
//  PrintStream is not applicable for the arguments (void) <<여기의 void 에서 눈치채면 될거같다

