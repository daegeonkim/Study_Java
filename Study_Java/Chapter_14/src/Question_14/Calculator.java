package Question_14;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try{
			calc.printDivide(1,2);
			calc.printDivide(1,0);	
		}catch (Exception e){
			//e.toString(); <<이거는 리턴값을 받는거기때문에 sysout 안에 적어줘야한다 기억해라아아아
			
			System.out.println(e.getMessage());
		}
	}

	public void printDivide(double d1, double d2)throws Exception{
			if(d2<=0){
				throw new Exception("Second value can't be Zero");
			}
		double result = d1/d2;
		System.out.println(result);
		
	}
	
	
	
	
}
