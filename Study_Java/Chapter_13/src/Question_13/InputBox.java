package Question_13;

public class InputBox {
	public InputBox(){	
	}
	KeyEventListener listener;
	public void setKey(KeyEventListener listener){
		this.listener = listener;
	}
	public static final int KEY_DOWN=2;
	public static final int KEY_UP=4;
	
	
	public void lisntenerCalled(int eventType){
		if(eventType==KEY_DOWN){
			listener.onKeyDown();
		}else if (eventType==KEY_UP){
			listener.onKeyUp();
			
		}
	}	
}
