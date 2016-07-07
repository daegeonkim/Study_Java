package Book2;

import Book2.Member_DTO;

public class MemberManager2 extends MemberManagerAbstract { // 빈 클래스로 컴파일할경우 abstract 로 선언되어있는 메소드 들이 구현도지ㅣ않아서 에러 발
	public boolean addMember(Member_DTO member){ // 인터페이스를 implements 했을때 처럼 반드시 abstract 에 정의된 메소드들의 몸통을 만들어주어야함.
		return false;
	}
	public boolean removeMember(String name, String phone){
		return false;
	}
	public boolean updateMember(Member_DTO member){
		return false;
	}
	public void printLog(String data){
		System.out.println("data= "+data);
	}
	
}

