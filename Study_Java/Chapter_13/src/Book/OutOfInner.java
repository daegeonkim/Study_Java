package Book;

public class OutOfInner {
	class inner{
		private int value=0;
		public int getValue(){
			return value;
		}
		public void setValue(int value){
			this.value = value;
		
		}
	}
}
