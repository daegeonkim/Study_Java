
public class Profile_2 {
	String name;
	int age;	
	public static void main(String args[]){
		Profile_2 me = new Profile_2();
		System.out.println("my age is "+me.setAge(10));
		System.out.println(me.setName("My name is"+"dennis"));
	}
	public String setName(String str){
		name = str;
		return name;
	}
	public int setAge(int var){
		age = var;
		return age;	
	}
}

	


//문제에는 printAge, printName 을 호출여 이름을 출력하라고했데 어려워서 내가 이해한대로 먼저 만들었다
// 고로 정답은 아님