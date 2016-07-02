package Book;

public class InheritanceObject {
	public static void main(String[] args) {
		InheritanceObject test =new InheritanceObject();
		test.toStringMethod2();
		
	}
	
	public void toStringMethod(InheritanceObject obj){
	System.out.println(obj);
	System.out.println(obj.toString());
	System.out.println("plus "+obj); //이것이 더하기연
	}

	public void toStringMethod2(){// 매개변수에 일일이 클래스.obj  를 안쓰
		System.out.println(this); //This로 사용할수도있다 *자기자신을 표현하니까
		System.out.println(toString());
		System.out.println("plus2"+this);
		//to string 은 getClass().getName() +"@" +Integer.toHexString(hashcode())
		//getClass의 결과에 getName메소드를 부르면 현재 클래스의 패키지이름과 클래스이름이 나온다*?
		// @는 앞과 뒤의 결과물을 구분짓기위해씀
		/* Integer...  해쉬코드 메소드는 int값을 리턴하여 그 값을 integer 라는 클라스에서 제공하는 toHexString이라는 메소드를 사용하여
		16진수로 변환하는 작업이 수행 */
	}
	
	public String toString(){
		return "InheritanceObject class"; // toString메소드를 오버라이딩하여 해당값을 리턴한다 
											// 그러면 해쉬값등이나오지않고 원하는 결과가 바로 출력된다
											// 주로 DTO를 사용할때 해야한다고한다
	}
	
	
	
	
	
}
