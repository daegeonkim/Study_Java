package Question_13;

public class MyPage { 
	
	static InputBox input;
	public static void main(String[] args) {
	MyPage page = new MyPage();
	page.setUI();
	page.pressKey();
	
	
	}
	
	public void setUI(){
		input = new InputBox();
		KeyEventListener listener = new KeyEventListener(){ // 인터페이스 객체를 불러왔는데 왜 구현을 하는걸까 implements도 아닌걸?
			
			@Override
			public void onKeyDown() {
				System.out.println("Key Down");
				// TODO Auto-generated method stub
			}
			@Override
			public void onKeyUp() {
				System.out.println("Key Up");
				// TODO Auto-generated method stub
			}
		};
		input.setKey(listener);
	}
		
	public void pressKey(){
		input.lisntenerCalled(InputBox.KEY_DOWN);
		input.lisntenerCalled(InputBox.KEY_UP);
	}
		
}


//풀긴 풀었지만 넘나 어려웠다 물어봐야겠다실행방식에대해