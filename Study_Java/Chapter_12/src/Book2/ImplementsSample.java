package Book2;

public class ImplementsSample {
	public static void main(String[] args) {
		//MemberManagerInterface manager = new MemberManagerInterface(); // 이렇게 사용한경우 인터페이스에는 구현된게 없음으로 구현할수 없다고 오류메시지 출력
		EmptyClassTest test = new EmptyClassTest();
		MemberManagerInterface manager = new MemberManager(); // 멤버 메니저인터페이스 타입의 변수같지만 실체는   맴버 매니
	
	}

}
