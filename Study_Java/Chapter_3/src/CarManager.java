public class CarManager{
	public static void main(String args[]){
		Car dogCar=new Car(); // Car() 은 생성자, 그럼 new 는 뭥미.(키워드인가, 뭐하는 키워드지 ??)
		// [Dec7] new는 생성자를 호출하는 키워드. 즉, 클래스를 객체화 시켜주는 키워드임
		// [Dec7] 클래스 이름이 곧 Type임. 그러니까 dogCar 변수는 Car 타입임
		dogCar.speedUp();// dogCar  앞에 Car 무슨의미일까
		dogCar.speedUp();
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.breakDown();
		System.out.println(dogCar.getCurrentSpeed());
		
	}
}
/*1차시도 현제속도를 리턴하는 메소드가 작동이 안됨 .
getCurrentSpeed 가 카 메ㅣ저에서 정의되지않았다고함. */
// System.out.println(getCurrentSpeed()); <<인스턴스를 안적어줌

/* 2차시도 
  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

	at CarManager.main(Car.java:21)

 이런 오류가 출력됨 */

/* 3차 시도 car.java 에 적어놓았던 Carmanager class를 삭제했더니 정상적으로 값이 출력된다. 
자바 파일과 클래스 별로 생성해서 프로그램을실행하는거에대해서 물어야겠다.
어떻게 요거만 실행해도 자동으로 Car class를 참조하게되는걸까 ?
실행은 패키지단위로되는건가 ....*/

// [Dec7] 이건 상황을 봐야할것 같은데.. 