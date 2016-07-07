package Book2;

public class Member_DTO{ //뭐가다른걸까 DTO?? 패턴 ??
	// DTO 어떤 속성을 갖는 클래스를 만들고 그 속성들을 쉽게 전달한다.
	// 속성은 뭐고 전달은뭘
	public String name;// 갑자기 왜 public 이 나온걸까 ..
	public String number;// 얘들은 왜 사용되지않았다는 내용이 나오지 않는걸까 ?
	public String email; 
	
	public Member_DTO(){     //  DTO 생성자는 DTO 안에서 선언한
	
	}
	public Member_DTO(String name){
		this.name = name;
	}
	public Member_DTO(String name, String number){
		this.name = name;
		this.number= number;
	}
	public Member_DTO(String name, String number, String email){
		this.name = name;
		this.number= number;
		this.email = email;
	}
	
	public static void main(String[] args) {
		Member_DTO.staticMethod();
	}
	
	
	public static void staticMethod(){
		System.out.println("This is Static Method");
		//System.out.println(name); Static 메소드는 클래스변수만 사용할수있기때문에인스턴스변수인 name을 사용할수없다
		/* 해결방법
		 * static 메소드를 그냥 메소드를 만드는 방법  >> 그럴경우 일반 메소드와 같이 객체를 생성한 후에 호출해야함
		 * 인스턴스변수를 클래스 변수로 선언한다(static 을붙혀준다) 
		 * ㄴ클래스변수로 선언할경우 객체마다 다른값이아닌 하나의 변수에 값을 저장하기떄문에 엄청난 혼란이 올수있다.
		 */
	}
	public String toString(){
		return "Name= "+name+" Phone= "+number+" eMail= "+email;
 	}
	public boolean equals(Object obj) {
		if (this == obj) //this 와 해당 obj 는 같은주소(같은객체라는 의미인가?)
			return true; 
		if (obj == null)// obj가 null이므로 당연히 false
			return false;
		if (getClass() != obj.getClass()) // 클래스의 종류가 다르므로 false
			return false;
		Member_DTO other = (Member_DTO) obj; // 같은 클래스이므로 형변환 실행(?) // 각 인스턴수변수가 같은지 비
		if (email == null) { //name 이 null 일
			if (other.email != null) //비교대상이 null이 아니면 false
				return false;
		} else if (!email.equals(other.email)) // 값이 다르면False
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	} // 주소값 비교 >객체에 값 비교 
	

}
