package Chapter_7;
	
public class Array {
	static String [] month ={"a", "b"};
	
	
	public static void main(String[] args) {
	Array aa = new Array();
	aa.arrayLength();
	System.out.println(month);
	
	
	}
	
	
	public void init(){
		int [] lottonumbers = new int[7]; // 인트형의 로또넘버라는 배열 선언 후 크기 7로 초기화
		lottonumbers[0] = 1; // 로또넘버 0 번인덱스에 1값 부여
		lottonumbers[1] = 12;
		lottonumbers[2] = 13;
		lottonumbers[3] = 14;
		lottonumbers[4] = 15;
		lottonumbers[5] = 16;
		lottonumbers[6] = 17;
		System.out.println(lottonumbers); // 위치출력 [I@7852e922
//											[는 배열이라는 의미 I 는 int 형이라느 의미 나머지는 저장된 위치를 의미
		
	}

	
	public void primitiveTypes(){
		byte [] byteArray = new byte[1]; //1짜리 바이트타입 배열선
		short [] shortArray = new short[1];
		int [] intArray = new int[1];
		long [] longArray = new long[1];
		boolean [] booleanArray = new boolean[1];
		
		System.out.println("byte Array [0]"+byteArray); // 기본값 0들 출
		System.out.println("short Array [0]"+shortArray);
		System.out.println("int Array [0]"+intArray);
		System.out.println("long Array [0]"+longArray);
		System.out.println("booleanarray= "+booleanArray);
		//Char의 경우 공백이다 (/uuuu)
	
	}
	public void referenceTypes(){
		String [] stringArray = new String [2];
		Array [] aa =new Array [2];
		stringArray[0] = "11";
		aa[0]=new Array();
		System.out.println(stringArray[0]);
		System.out.println(aa[0]);
		System.out.println(stringArray[1]);
		System.out.println(aa[1]);
		System.out.println(stringArray);
		System.out.println(aa);
		// string, Array 의 초기값의 경우 null(없음)
	}
	
	public void otherInit(){
		int [] lottoNumbers = {5, 12, 23, 25, 38, 41, 2}; // 배열선언 후 초기화 후 , 인덱스 넘버마다 값을 지정하지않고 이렇게 
															// 중괄호안에 콤마로 구분하여 한번에 적을수있다. ** 세미콜론으로 마무리 지어야한다.
															// 선언과 초기화와 값 지정을 한번에해야함 
		System.out.println(lottoNumbers);  
		/* int [] lottonumbers;
		lottonumbers = [1,2,3,4]; << 이렇게 선언하면 안된다. */
	/* 보통 절대 변경되지 않는 값을 지정할때 중괄호로 선언하여 사용 ex: 월, 요일등등 
	 *ㄴ 하지만 이런경우 클래스 변수로선언하여 사용하는것이 좋다 ( 변하지 않으니까 여러군데에서 사용가능하게 하기 위해일까?)
	 */
	}

	public void twoDimensionArray(){
		int [][]twoDim;
		twoDim =new int[2][3]; // int [][] twoDim = new int [2][3]; 과의 차이점은 뭘
		/*twoDim = int[][]; 배열 크기를 설정안하거
		twoDim = int[][1];  두번재 배열만 크기를 설정한경우 사용할수없다
		*/
		int [][]twoDim2={{1,2,3},{4,5,6}}; // 중괄호를 이용하여 한번에 선언할수도있다.
		int [][]twoDim3= new int [2][]; // 위에서 한번 설명한 1차원배열만 설정하고 2차원은 하지않은경
		twoDim3 [0] = new int [3]; // 이와같이 0과 1의 속하는 배열을 각각 다른 크기로 설정할수있
		twoDim3 [1] = new int [2]; // 이경우 첫번째칸은 3줄, 둘째칸은 두줄 이런 모양의 배열이 생성된다 
		
		/* 다차원 배열은 새로 가로 이미지를 생각하면서 그리자
			다차원배열은 "배열 안의 배열" 
		*/
	}
	public void arrayLength(){
		int monthLength=month.length; //2 출력됨 (a,b)
	//   ㄴlength 기능이  int  값으로 변환해주기때문에 변수도 int 로 선언해야하는것같다.
		int [][]twoDim ={{1,2,3},{4,5,6}};
		int twoDimLength = twoDim.length;
		int twoDimLength1 = twoDim[0].length;
		int twoDimLength2 = twoDim[1].length;
		System.out.println(twoDimLength);
		System.out.println(twoDimLength1);
		System.out.println(twoDimLength2);
		System.out.println(monthLength);

	}
	
	
}