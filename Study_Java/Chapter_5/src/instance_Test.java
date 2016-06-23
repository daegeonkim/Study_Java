
public class instance_Test {
	int num; // 인스턴스 변수 
	public static void main(String[] args) {
		instance_Test aa = new instance_Test ();
		aa.setNumber(123);
		int aa1 = aa.returnNumber();
		System.out.println(aa1);
		
		instance_Test bb = new instance_Test ();
		bb.setNumber(456);
		int bb1 = bb.returnNumber();
		System.out.println(bb1);
		
		System.out.println("-------------");
		
		System.out.println(aa.num);
		System.out.println(bb.num);
		
	}
	public void setNumber(int num){
		this.num= num; //this 는 매개변수가 아니라 인스턴스 변수와 연결시켜준다.
						//인스턴스변수 num = 매개변수
	}
	public int returnNumber(){
		return num;   // 위에서 받은값을 리턴한다(setNumber를 호출하지않으면 값이 기본값0이나온다)
	}

}
