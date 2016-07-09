package Book;

public class AnnotationSample {
	
	@SuppressWarnings("deprecation") // 괄호안의 경고를 무시하고 ㄱ 
	public void useDeprecated(){
		AnnotationChild test = new AnnotationChild();
		test.noMoreUse(); //The method noMoreUse() from the type AnnotationChild is deprecated
							// 이것은 경고 에러가 아님
	}
	
}
	