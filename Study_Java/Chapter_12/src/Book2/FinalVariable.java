package Book2;

import Book2.Member_DTO;

public class FinalVariable {
	final int instaceVariable =1; // 클래스, 인스턴스변수의 경우 final  로 선언시 선언과 동시에 값을 초기화 해야한다.
	
	public void method(final int parameter){ 
		final int lovalVariable;
	}
	// 매개변수는 사용할때마다 초기화되고 지역변수는 메소드 내에서만 사용되기때문에 변경할일이 없음으로 사용 가능.
	
	public void method2(final int parameter){
		final int localvariable;
		localvariable = 3;
		//localvariable =2;  위에 이미 정의해서 변경불가 
		//parpameter =4; 위에 이미 정의해서 변경불가 
		}
	
}
