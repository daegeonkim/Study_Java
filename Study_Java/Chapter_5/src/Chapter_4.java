
public class Chapter_4 {
	static double month_Salary;
	static double tax1;
	static double tax2;
	static double tax3;
	public static void main(String[]args){
	Chapter_4 me =new Chapter_4();
	me.c_Tax1(month_Salary);
	me.c_Tax2(month_Salary);
	me.c_Tax3(month_Salary);
	System.out.println(me.mSalary(2000000));
	}
	
	public double mSalary(int ySalary){ 
		int year = 12;
		month_Salary = ySalary/year;		
		System.out.println("Your Origin Salary"+month_Salary);
		System.out.println("Your Tax1 is "+tax1);
		System.out.println("Your Tax2 is "+tax2);
		System.out.println("Your Tax2 is "+tax3);
		month_Salary = month_Salary -tax1 - tax2 - tax3;
		return month_Salary; //리턴되면 어디로가더라 ... 
								//메소드 안에서 메소드를 부른다고 ??
		
	}
	
	public double c_Tax1(double month_Salary){
		tax1 = month_Salary / 12.5;
		return tax1;
	}
	public double c_Tax2(double month_Salary){
		tax2 = month_Salary / 8.1;
		return tax2;
	}
	public double c_Tax3(double month_Salary){
		tax3 = month_Salary / 13.5;
		return tax3;
	}
}



/*텍스값 출력안됨, c_tax1을  mSalary 안에서 호출하여 세금을 얼마나 공제해야하는지 얻어내라는데 무슨말인지 모르겠다.
 메소드 안에서 메소드를 부르라는거가 ....*/
