package Chapter_6;

public class controlOfFlow {
	public static void main(String[]args){
		controlOfFlow controll = new controlOfFlow ();	
		controll.forLoop(10);		
	}
	
	
	
	public void ifStatement(){
			if(false);
			if(true) System.out.println("it is true");
			if(true)
				System.out.println("it is also true");
//			if(false)
//				System.out.println("it is false ");  이 경우 위에 이미값이 True 인 경우  라는 구문이 사용되어재사용은 불가
													// false 인 경우인 else 로 다른 조건일 경우 실행되는 코드 구현 가능 
//			else System.out.println("it is flase");
	}
	
	
	public void ifStatement2(){
		int intValue = 5;
		
		if(intValue>5) System.out.println("it is bigger than 5"); //값이 5 이상인 경우, 해당 내용을 출력한다.
		else System.out.println("it smaller than 5 or it is 5");
		if(intValue<=5) System.out.println("it is 5");
		else System.out.println("it is bigger than 5");
		}											 
/* 왜 true 값이 나오는걸까 boolean 의 기본값은 false 인데
     파이썬에는 if구문을 여러개 걸수있었는데 여기서는 메소드별로 하나밖에안되는건가 ??
	 서로 다른 메소드(기능)이라서 상관없는 얘기(
	 증명
	 * a= 11
	 * if a == 1:
	 * 	print("True)
	 * if a =! 1:
	 * 	print("false")
	 * else:
	 * 	 print(False)      의 경우 실행하면 ture, Fals  출력됨  
	 * 
	 */	
	
	public void ifStatement3(){
		int age = 25;
		boolean isMarried=true;
		if(age>25&&isMarried) {
			System.out.println("Age is over 25 & Married");
		}
		if(age>25||isMarried) {
				System.out.println("Age is over 25 & Married");		
		}
		double height = 180.00;
		if ((age > 25 || isMarried) && height >=180){
			System.out.println(
					"Age is over 25 or married and height is over 180.00");
		}
	}
	
	
	public void ifStatement4(int point){ //if else 
		if(point>90){ // 괄호 열고 닫는게 햇갈린다.
			System.out.println("A");
		}
		else if (point>80){ //상위 if 에서 false 인 경우 처리
			System.out.println("B");	
		}
		else if (point>70){ // 상위 else if 에서 false인 경우 처
			System.out.println("C");
		}
		else{
			System.out.println("D");
		}	
	}

	
	public void switchStatement(int numberOfwheel){ //case 를 여러개 설정하고 해당 매개변수와 일치하는 케이스 내용 처리
		switch(numberOfwheel){
		case 1:
			System.out.println("It is onefoot bicycle"); // 매개변수가 1일 경우 하위 코드 실행한
			break;// break 처리 하지않을경우 다음break 이 나올때까지 아래 경우까지 조건을 무시하고 읽어버린다.(한번 통과했기때문에)
		case 2:
			System.out.println("it is motorcicyle or bycicle.");
			break;
		case 3:
			System.out.println("it is a three wheel car");
			break;
		case 4:
			System.out.println("it is a car");
			break;
		default:
			System.out.println("it is an expensive car");
			break;
		}
	}


	public void switchStatement2(int month){ // 원하는 조건을 충족하는 여러 내용(case)를 묶은 뒤 break 으로 나눈다.
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month +" has 31 days.");
			break;
		case 4:
		case 6:
		case 9:
			System.out.println(month +" has 30 days.");
			break;
		case 2:
			System.out.println(month +" has 27 days.");
			break;	
		}
	}



	public void switchTest(String test){ //스트링값도 처리 가능하다.
		switch(test){
			case "a":
				System.out.println("it is a.");
				break;
			case "b":
				System.out.println("it is b");
				break;
			case "B":
				System.out.println("it is B");
				break;
			default:
				System.out.println("I didn't learn yet....");
		}
	}
	


	public void whileLoop(){
		int loop = 0;
		while(loop<12){ // 12보다 적은 경우 하위 코드를 반복한다** 12 의 경우 값이 false 가 되기때문에 12월까지 내용이 출력된다.
						// 실질적으로 11까지 반복되나 11+1, switchStatement2(12);  가 되기때문에 12월까지 내용 출력됨 .
			loop++;
			if(loop == 6) continue ; 
			switchStatement2(loop); //반복루프가 메소드를 포함하고있기때문에 12가 될때까지 반복됨(12번 반복도기때문에 12월까지 출력된다)
			/* 6까지만 반복하고 싶은경우 while 조건을 변경하거나 **if 구문을 사용할수있다
			  
			 */
			if(loop == 6) break ; //if조건문에 처리 코드로 break 을 사용할수도 있다.(예약어 사용 가능인듯) 
	//		if(loop == 6) continue ; // continue 는 조건에 해당하는 대상을 skip 한다 .
									// 여기 위치한경우에는 이미 switchStatement2 메소드가 사용됬음(프린트) 됬음으로 컨틴뉴 사용이 안됨.
			
		}
	}

	
	public void whileLoop2(){
		boolean test = true; 
		int test1 = 0;
		do{ //값이 false 여도 상관없이 1회 반복되어 
			test1++;
			System.out.println(test1); // 출력되는값은 1이 나온다
			if(test1==6) break;// 중괄호 안에 내용을 반복한
		}while(test); // if 와 break 을 사용하는경우 어디에 사용하는걸
	}
	
	
	public void forLoop(int until){ // 받을 매개변수 설정함.
		int sum = 0; //부터 합을 저장할변수 설정 
		for (int loop =1; loop<=until; loop++){ // loop 값을 초기화하고, 종료조건을 확인한다음 값이 true 인 경우, 조건값 증가
			sum+=loop; // +=??	조건값 증가 후에 반복문장이 실행되고 종료조건이 false 가 될때까지 반복된다.
		if(loop ==9) break;// 9에서 break 되기때문에 45 출력됨 
		}
		System.out.println("1 to "+until+"="+sum);
	}
	/* 1. 초기화값에 변수 초기화
	 * 2. 종료조건이 true 인지 False 인지 확인후 true인 경우 반복문장 수행됨.
	 * 3. 수행 이후 조건값 증가 변수를 증가시킴.
	 * 4. 조건값 증가 변수(초기화 변수) 가 종료조건을 다시 비교하여 True 인 경우 다시 반복문장 수행.
	 * 5. 종료조건 false 될때까지 반복문장 수행됨.
	 */ 


}

	