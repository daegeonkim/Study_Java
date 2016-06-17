package Chapter_6;

public class Question_6 {
	public static void main(String[]args){
		Question_6 method = new Question_6();
		//method.for(int loop=1;loop<day;loop++){ // for 를 어떻게 메인안에서 사용할까 day 를 사용하려면 생성객체 안에서 처리해야하는거같은데..
		System.out.println(method.carculate(10, 100));	
		}
	
	public double getRate(int day){
		double aa;
		if(day <= 90) aa = 0.5;
		else if(day < 181) aa = 1; // 범위지정어떻게했더라 .. 91~181 
		else if(day < 364) aa = 2;
		else aa= 5.6;	
	return aa;
	}
	
	public double carculate(int day, long amount){ // 날짜에 해당하는 이자율 +입금금액 값을 리턴해야한
		double totalAmount = amount+amount*(getRate(day)/100);
		forLoop(day, amount);
		return totalAmount;// duplicate local variable totalAmount, return connot be resolved to a type
		
	}
	public void forLoop(int day, long amount){
		for(int loop= 1;loop<day;loop++){
			carculate(loop, amount);
		}
	}
	
}


/* 일수에 따른 이자 퍼센트 계산 
	예치금액 + 이자 

요구내용 : 이자를 얼마나 받는지, 총갖게되는 금액 출력 요구

필요 변수 : 예치금액, 이자




*/