package Book2;

import Book2.Member_DTO;


public class MemberManager implements MemberManagerInterface { // 이대로 실행할경우 abstract 를 구현하지 않았기때문에 컴파일이 불가하다.
	public boolean addMember(Member_DTO member){ // 위와같이 인터페이스를 나열한경우 반드시 인터페이스에 정의된 메소드들의 몸통을 만들어주어야함.
		return false;
	}
	public boolean removeMember(String name, String phone){
		return false;
	}
	public boolean updateMember(Member_DTO member){
		return false;
	}
	


}
	