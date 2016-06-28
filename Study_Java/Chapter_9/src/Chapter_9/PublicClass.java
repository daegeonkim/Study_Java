package Chapter_9;

/*class PublicClass {
	public static void main(String[] args) {
		
	}
}
class PublicSecondClass{
	
}
*/
// 둘다 package pirvate 이기때문에 ( 같은 패키지 내에서 객체를 생성하고 사용가) 컴파일 오류가 나지않는다

/*public class PublicClass{
	public static void main(String[] args) {
		
	}
}

class PublicSecondClass{
		
}
클래스 파일 이름에 해당하는 클래스만 퍼블릭이기 때문에 전혀 문제없다 .


*/


public class PublicClass{
	
}

public class PublicSecondClass{ // 이경우 public 으로 선언한 메소드와 파일명이 다르기때문에 사용할수없다 
	
	
}