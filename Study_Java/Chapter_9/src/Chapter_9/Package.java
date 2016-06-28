package Chapter_9;
import sub.sub;
//import static sub.sub.subClassStaticMethod; // 하지만 import 스테틱을 이용하
//import static sub.sub.CLASS_NAME;
import static sub.sub.*;

public class Package {
	
	
	public static void main(String[] args) {
		System.out.println("package Class");
	sub aa =new sub();
	aa.subClassMethod();
	
	
	subClassStaticMethod(); //이렇게 사용할수있다. 
	System.out.println(CLASS_NAME); //파이썬에 모듈임포트중에 다른것(?)(확인필요) 와 같은듯.
	
	//aa.subClassStaticMethod(); //sub에 있는 스태틱 메소드를 사용하려면 다른 메소드와똑같이 오브젝트에 메소드이름으로 선
	//System.out.println(sub.CLASS_NAME); //sub안에 클래스 변수 이용할때 다른것과 똑같이 클래스.변수이름 적어
	
	aa.publicMethod(); 
	//aa.protectedMethod();
	//aa.packagePrivateMethod();
	//aa.privateMethod();
	// public 을 제외한 3개의 메소드 다 The method protectedMethod() from the type sub is not visible 보이지않는다고 오류 출력 
	
	
	
	
	}



}
