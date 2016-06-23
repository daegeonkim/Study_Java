package Chapter_7;

public class ReferenceTypes {
	public ReferenceTypes(){
		
	}
	public ReferenceTypes(String str){
		
	}
	public static void main(String[] args) {
		ReferenceTypes reference = new ReferenceTypes();
		ReferenceTypes reference1 = new ReferenceTypes("a");
	}
	public class MemberDTO{ //뭐가다른걸까 DTO?? 패턴 ??
		// DTO 어떤 속성을 갖는 클래스를 만들고 그 속성들을 쉽게 전달한다.
		// 속성은 뭐고 전달은뭘
		public String name;// 갑자기 왜 public 이 나온걸까 ..
		public String phone;// 얘들은 왜 사용되지않았다는 내용이 나오지 않는걸까 ?
		public String email; 
	}
	public MemberDTO getMemeberDTO(){
		MemberDTO dto=new MemberDTO();
		return	dto;
	}
	public void makeMemberDTO(){
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("snagmin");
		MemberDTO dto3 = new MemberDTO("snagmin", "01066075086");
		MemberDTO dto4 = new MemberDTO("sangmin", "01066075086", "sectoe999@gmail.com");
	}


}
