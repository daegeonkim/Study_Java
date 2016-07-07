package Question_Chapter12;

public enum HearthInsurance {
	
	LEVEL_ONE(1000, 1.0),
	LEVEL_TWO(2000, 2.0),
	LEVEL_THREE(3000, 3.2),
	LEVEL_FOUR(4000, 4.5),
	LEVEL_FIVE(5000, 5.6),
	LEVEL_SIX(6000, 7.1);
	
	
	protected int value;
	protected double percent;
	HearthInsurance(int value, double percent){
		this.value = value;
		this.percent = percent;
	}
	protected double getRatio(){
		return percent;
		
	}
	public static HearthInsurance getHealthInsurance(int salary){
		if (salary<1000) {
			return LEVEL_ONE;
		}else if(salary<2000){
			return LEVEL_TWO;
		}else if(salary<3000){
			return LEVEL_THREE;
		}else if (salary<4000){
			return LEVEL_FOUR;
		}else if (salary < 5000){
			return LEVEL_FIVE;
		}else{
			return LEVEL_SIX;
		}
	//	}else if (salary <6000){ 마지막도 else if 로 해서  최종적으로 예외인경우 리턴되는값이 없어서 오류가 출력됬었다 ..
	//		return LEVEL_SIX;
		
		// 이렇게 if 문을 하나하나쓰면되는데 나는 values()와 배열을 이용하여 값을 전부 매긴다음 
		// 적혀진 샐러리값을 이용하여서 해당 생성자를 찾으려고했다. 나중에 가능한 방법을 찾아보자.
		
	}
	public static void  main(String []args) {
		int salaryArray[]=new int[]{1500,5500,8000};
		HearthInsurance[] insurances=new HearthInsurance[3];
		insurances[0]=HearthInsurance.getHealthInsurance(salaryArray[0]);
		insurances[1]=HearthInsurance.getHealthInsurance(salaryArray[1]);
		insurances[2]=HearthInsurance.getHealthInsurance(salaryArray[2]);
		
		for(int loop=0;loop<3;loop++) {
			System.out.println(salaryArray[loop]+"="+insurances[loop]+","+insurances[loop].getRatio());
		}
	}
}
