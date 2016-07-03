package Book;

public class InheritanceObject {
	public static void main(String[] args) {
		InheritanceObject test =new InheritanceObject();
		test.toStringMethod(test);
		System.out.println("------------------");
		System.out.println(test.DtoName()); // toString 을 오버라이딩하지않으면 그냥 해쉬값이나온
		System.out.println("-------------------");
		test.equalMethod();
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
	
	public Member_DTO DtoName(){
		Member_DTO dto = new Member_DTO("Snagmin", "010123", "123@asd");
		/*위 내용출력 원할경우
		 * Sysout("name= "+dto.name ...) 이렇게입력해야만 한다 허
		 하지만 아래에 DTO에 toString 을 오버라이딩 이용할경
		
		public String toString(){
		return "Name= "+name+" Phone= "+number+" eMail= "+email;
 		*/
 		return dto;
		// toString 을 오버라이딩하지않으면 그냥 해쉬값이나온
		
	}

	public void equalMethod(){
		Member_DTO obj1 = new Member_DTO("Dennis");
		Member_DTO obj2 = new Member_DTO("Dennis");
/*		if(obj1==obj2){ // 이렇게할경우 주소값을 비교하기때문에 다르다고나온다(equal 메소드를 사용해야한다)(오버라이딩을 먼저해놔야한_)
			System.out.println("Same one");
		}else{
			System.out.println("Different one");
		}
	}*/
		if(obj1.equals(obj2)){
			System.out.println("same one");
		} else{
			System.out.println("Different");
		}
	}
	 
	
	
	
}
		
		
		
