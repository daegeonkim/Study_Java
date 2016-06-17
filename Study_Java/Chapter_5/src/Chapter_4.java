
public class Chapter_4 {
	public static void main(String[]args){
	Chapter_4 me =new Chapter_4();
	System.out.println(me.mSalary(2000000));
	}
	
	public double mSalary(int ySalary){ 
		
		double month_Salary = ySalary/12.0;		// 셀러리 개월수로 나
		double taxx1 = c_Tax1(month_Salary);
		double taxx2 = c_Tax2(month_Salary);
		double taxx3 = c_Tax3(month_Salary);
		double total_Tax = month_Salary -(taxx1 + taxx2+ taxx3) ;
		System.out.println("Your origin Salary is  "+month_Salary);
		System.out.println("Your tax1 is "+taxx1);
		System.out.println("Your tax2 is "+taxx2);
		System.out.println("Your tax3 is "+taxx3);
		System.out.println("Your Total Salary is "+total_Tax);
		System.out.println(month_Salary);
		return month_Salary; //리턴되면 어디로가더라 ... 
								//메소드 안에서 메소드를 부른다고 ??	
					
	}
	
	public double c_Tax1(double month_Salary){
		double tax1 = month_Salary*(12.5/100);
		return tax1;
	}
	public double c_Tax2(double month_Salary){
		double tax2 = month_Salary*(8.1/100);
		return tax2;
	}
	public double c_Tax3(double month_Salary){
		double tax3 = month_Salary *(13.5/100);
		return tax3;
	}
}

//  답을 보고 생각하면서 했으나 택스값이 이상하다.... ㅠㅠㅠㅠㅠㅠㅇ웡호ㅓ호ㅓㅇ노ㅓㄴ오ㅓ혼ㅇㅎ