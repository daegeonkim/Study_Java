
public class Calculatr_instance { // 변수 공
	public static void main(String args[]){
		Calculator_I_Made me = new Calculator_I_Made(); 
		int a = 10;
		int b = 15;
		
		System.out.println(me.add(1, 2));
	}
}

/*
지역변수 : a, b, me
ㄴ 중괄호 내애서 선언된 변수
ㅁ 지역변수를선언한 중괄호 내에서만 유효하  
 **메소드 안의 중괄호에서 선언된걸 의미하는건가 ??(클래스도 중괄호를 갖고있으니??)


매개변수: args
ㄴ 메소드나 생성자에게 넘겨주는 변수 ((이게 무슨의미일까 )), 파이썬에 인자같은건
ㅁ 메소드가 호출될때 생명이 시작되고, 메소드가 끝나면 소멸된다(호출이 될때 시작하지는 않지만 (??))


인스턴스 변수: speed, distance, color (car class)
ㄴ 메소드 밖에,클래스 안에 선언된 변수. 앞에는 static이라는 예약어가 없어야 한
ㅁ 객체가 생성될때 생명이 시작되고, 그 객체를 참조하고있는 다른 객체가 없으면 소멸

클래스변수 : 인스턴스 변가장 앞에 static 분일경우 클래스변수가됨
ㄴ 인스턴스 변수처럼 메소드 밖에, 클래스 안에 선언된 변수중에서 타입 선언 앞에 static  이라는 예약어가 있는 변수
ㅁ 클래스가 생성될때 생명이 시작되고 자바프로그램이 끝날때 소

ㅡ 여기서 소멸이란건 어떤걸 의미하는걸까 삭제??

*/

public class VariableYypes{
	int instanceVairable;
	static int classVariable;
	public void method(int parameter){
		int local variable;
	}
}



