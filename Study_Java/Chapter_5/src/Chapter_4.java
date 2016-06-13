
public class Chapter_4 {
	static double month_Salary;
	static double tax1;
	static double tax2;
	static double tax3;
	public static void main(String[]args){
	Chapter_4 me =new Chapter_4();
	System.out.println(me.mSalary(2000000));
	me.c_Tax1(month_Salary);
	me.c_Tax2(month_Salary);
	me.c_Tax3(month_Salary);
	}
	
	public double mSalary(int ySalary){ 
		int year = 12;
		month_Salary = ySalary/year;		// 셀러리 개월수로 나
		me.c_Tax1(month_Salary);
		System.out.println("Your Origin Salary"+month_Salary); // 원래 1달 월
		System.out.println("Your Tax1 is "+tax1); // 텍스1 금
		System.out.println("Your Tax2 is "+tax2);// 텍스 2 금
		System.out.println("Your Tax2 is "+tax3);//텍스 3 금
		month_Salary = month_Salary -tax1 - tax2 - tax3; // 택스 빼고 나의실수령 금
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
/*문제점 : 세금 계산 메소드를 따로만듬.
월급계산 >세금계산>세금출력>월급-세급 >값 출력
순서 여야하는데 월급 계산하면 텍스값까지 나오 프로그래밍 하라고함 ...
*/
//메소드 안에 객채를 만들수가없는데 메소드안에서 어떻게실행하라는거지 
// 기존에 만든 객체가 인스턴스 변수처럼 사용될줄알고 했는데 메소드안에서는 사용될수가없다

