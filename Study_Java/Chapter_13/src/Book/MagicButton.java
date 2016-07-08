package Book;

public class MagicButton {
	public MagicButton(){  // 얘는 뭐지 메소드인가  // 생성자란다 ..

	}
	private EventListener listener;
	public void setListener(EventListener listener){ //이벤트르스너 타입의 변수를 말함
		this.listener = listener;  // 이 작업은 뭘위해하며 뭐를 의미하는걸까 ?
	}
	public void onClickProcess(){
		if(listener != null){
			listener.onClick();
		}
	}
}

