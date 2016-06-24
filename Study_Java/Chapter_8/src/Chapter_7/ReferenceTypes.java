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
		public String number;// 얘들은 왜 사용되지않았다는 내용이 나오지 않는걸까 ?
		public String email; 
		
		public MemberDTO(){     //  DTO 생성자는 DTO 안에서 선언한
		}
		public MemberDTO(String name){
		this.name = name;
		}
		public MemberDTO(String name, String number){
			this.name = name;
			this.number= number;
		}
		public MemberDTO(String name, String number, String email){
			this.name = name;
			this.number= number;
			this.email = email;
		}
			
	
	}
	
	
	
	public MemberDTO getMemeberDTO(){
		MemberDTO dto=new MemberDTO();
		return	dto;
	}
	
	public void makeMemberObject(){
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Dennis");
		MemberDTO dto3 = new MemberDTO("Dennis", "01066075086");
		MemberDTO dto4 = new MemberDTO("Dennis", "01066075086", "Email");
		}

}
