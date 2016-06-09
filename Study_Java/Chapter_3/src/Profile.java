
public class Profile {
	String name;
	int age;
	public static void main(String args[]){
		Profile profile = new Profile();
		profile.setName("minji");
		profile.setAge(20);
		System.out.println(profile.printName());
		System.out.println(profile.printAge());
	}
	public void setName(String str){
		name = str;
	}
	public void setAge(int val){
		age = val;
	}
	public void printName(){
		return name;
	}
	public void printAge(){
		return age;
	}
}

