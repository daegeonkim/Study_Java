package Book;

public class NestedSample {
	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		sample.makeStaticNestedObject();//?
	}
	public void StaticNestedObject(){
		OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
		
	}
	
	
	
	public void makeInnerObject(){
		OutOfInner outer = new OutOfInner();
		OutOfInner.inner inner = outer.new inner();
		inner.setValue(2);
		System.out.println(inner.getValue());
		
	}
	
	public void setButtonListener(){
		MagicButton button = new MagicButton();
		//MagicButtonListener listener = new MagicButtonListener();
		//button.setListener(listener);
 
		
		button.setListener(new EventListener(){ // 이 매개변수는 또 뭘까
			public void onClick(){
				System.out.println("MagicButton is Clicked");
			}
		});
		
		
		button.onClickProcess(); // MagicButton 에 객체가 MagicButtonListener 에 메소드를 쓴다 ?? // 같은 패키지라서 상관없나
		}
	
	class MagicButtonListener implements EventListener{
		public void onClick(){
			System.out.println("MagicButton Clicked!!!");
		}
		
	}
}
