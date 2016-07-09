package Book;

import Book.Parent;

public class AnnotationChild extends Parent {
	@Override // 제대로 오버라이드 했는지 확인하는 수
	public void printName(){
		System.out.println("AnnotationChild");
	}
	/*public void printName(String arg){       이렇게 할경우 어노테이션으로 오버라이드했는데, 부모클래스에 해당 메소드(매개변수가 String)가
		System.out.println("AnnotationChild");           없기때문에 에러메시지가 발생한다.
	}*/
	@Deprecated
	public void noMoreUse(){//The method noMoreUse() from the type AnnotationChild is deprecated
	}
	
	

}
