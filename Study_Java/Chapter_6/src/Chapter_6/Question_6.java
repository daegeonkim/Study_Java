package Chapter_6;

public class Question_6 {
	public static void main(String[]args){
		Question_6 method = new Question_6();
		//method.for(int loop=1;loop<day;loop++){ // for 를 어떻게 메인안에서 사용할까 day 를 사용하려면 생성객체 안에서 처리해야하는거같은데..
		for(int day = 10; day<=90; day+=10){ //day(loop) 변수 설정함 
			double amount = method.carculate(day, 1000000);
			System.out.println(day+":"+amount+""); //일 마다의금액을 보여줘야하기때문에 day와 loop 에 대한 변수가 같이 사용되야함
													// loop으로 설정해서 안됬던거같다 ..
													// 인자값이 통일되서 메소드 운영에 막힘이없다 !
		}
		}
	
	public double getRate(int day){
		double aa;
		if(day <= 90){ 
			aa = 0.5;
		}
		else if(day < 181){
			aa = 1; // 범위지정어떻게했더라 .. 91~181 
		}
		else if(day < 364){
			aa = 2;
		}
		else{
			aa= 5.6;	
		}
	return aa;
	}
	
	public double carculate(int day, long amount){ // 날짜에 해당하는 이자율 +입금금액 값을 리턴해야한
		double totalAmount = amount+amount*(getRate(day)/100);
		//forLoop(day, amount);
		return totalAmount;
		
	}
	/*public void forLoop(int day, long amount){
		for(int loop= 1;loop<day;loop++){
			carculate(loop, amount); // 이렇게할경우 loop = day 가 되서 반복이 안
		}
	}*/
	
}


/* 일수에 따른 이자 퍼센트 계산 
	예치금액 + 이자 

요구내용 : 이자를 얼마나 받는지, 총갖게되는 금액 출력 요구

필요 변수 : 예치금액, 이자




*/