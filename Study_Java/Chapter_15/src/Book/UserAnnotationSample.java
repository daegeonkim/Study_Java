package Book;

import java.lang.reflect.Method;

public class UserAnnotationSample {
	
	
	
	@UserAnnotation(number=0)
	public static void main(String []arg){
		UserAnnotationSample sample = new UserAnnotationSample();
		sample.checkAnnotations(UserAnnotationSample.class);
	}
	
	@UserAnnotation(number =1)
	public void annotationSample1(){
	}
	
	@UserAnnotation(number = 2, text = "second")
	public void annotationSample2(){
	}
	
	@UserAnnotation(number = 3, text = "third")
	public void annotationSample3(){
	}
	
	//어노테이션 값 확인
	public void checkAnnotations(Class useClass){
		Method[] methods = useClass.getDeclaredMethods(); // Class 클래스에 선언되어있는 getDeclaredMethods를 호출하면	
														// 해당 클래스에 선언되어있는 메소드드들의 목록을 배열로 리턴한다.
		for(Method tempMethod:methods){
			UserAnnotation annotation =
					tempMethod.getAnnotation(UserAnnotation.class);;// Method 클래스에 선언되어있는 getAnnotation 이라는 메소드를 호출하면,
															// 해당 메소드에 선언되어있는 매개변수를 넘겨준 어노테이션이 있는지 확인하고
															// 있을 경우 그 어노테이션으 객체를 리턴해준다 
			if(annotation!=null){
				int number =annotation.number(); // 어노테이션에 선언된 메소드를 호출하면 그 값을 리턴해준다 
				String text = annotation.text(); // 어노테이션에 선언된 메소드를 호출하면 그 값을 리턴해준다 
				System.out.println(tempMethod.getName()+" ():number="+number+" text= "+text);
			}else{
				System.out.println(tempMethod.getName()+"(): annotation is null");
			}
		}
	}
	
}
