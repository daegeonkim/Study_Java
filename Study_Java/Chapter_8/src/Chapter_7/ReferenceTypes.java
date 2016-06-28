package Chapter_7;

public class ReferenceTypes {
	public ReferenceTypes(){
		
	}
	public ReferenceTypes(String str){
		
	}
	
	
	public static void main(String[] args) {

		ReferenceTypes reference = new ReferenceTypes();
		ReferenceTypes reference1 = new ReferenceTypes("a");
		//reference.method_End_Test();
		//Member_DTO.staticMethod();
		//reference.chechMemberDTOName();
		//reference.callPassByValue();
	//	reference.calculateNumbers(1,2,3,4,5);
		StaticBlock test = new StaticBlock();
		System.out.println(test);
		System.out.println(test.data);
		
		
	}
	
	public Member_DTO getMemeberDTO(){
		Member_DTO dto=new Member_DTO();
		return	dto;
	}
	
	public void makeMemberObject(){
		Member_DTO dto1 = new Member_DTO();
		Member_DTO dto2 = new Member_DTO("Dennis");
		Member_DTO dto3 = new Member_DTO("Dennis", "01066075086");
		Member_DTO dto4 = new Member_DTO("Dennis", "01066075086", "Email");
		}
	
	public void print (int data){
		
	}
	public void print (String data){
		
	}
	public void print (int intData, String stringData){
		
	}
	public void print (String stringData, int intData){
		
	}


	public int return_Test(){
		int returnInt = 0;
		/*return returnInt;
		returnInt++ 리턴뒤에 다른문장이 올수없다 */
		
		if (returnInt ==0){  // if 의 경우 조건문에 해당하는경우에만 return 됨으로 조건문, 예외 총 2개의 리턴이 필요
			return ++returnInt;
		}/*else{
		return --returnInt*/  // 엘스문을 이렇게 사용할수있
		return --returnInt;		 // 엘스를 쓰지않는경우 
	
	}

	
	public void method_End_Test(){
		int aa= 0;
		++aa;
		++aa;
		aa++;
		System.out.println("over");
		if(aa ==3){ 
			return; //리턴; 은 메소드 종료를 의미 
		}
		System.out.println(aa); //종료되어 실행되지않음 ( 위에 If문이 없을경우 닿을수없는(?)변수라며 오류출력)
		
	}

	
	public void chechMemberDTOName(){
		Member_DTO dtoo1 = new Member_DTO("Sangmin");
		System.out.println(dtoo1.name);	
		Member_DTO dtoo2 = new Member_DTO("Dennis");
		System.out.println(dtoo1.name);
	}

	public void makeStaticBlockObject(){
		System.out.println("Data="+StaticBlock.getData()+"creating block1"); // 클래스.메소드 이건 어떻게된거지 ???
		StaticBlock block1 = new StaticBlock();
		System.out.println("created block1");
		System.out.println("Data="+StaticBlock.getData()+"creating block2");
		StaticBlock block2 = new StaticBlock();
		System.out.println("created block2");
	
	}

	public void callPassByValue(){
		int a =10;
		String b ="b";
		Member_DTO member = new Member_DTO("Sangmin");
		passByValue(a,b,member); // << 메소드안에서 메소드를 부른거아닌가..? 다른 의미가 또있나 ..
		System.out.println("callpassbyValuye method result !!");
		// callpassbyValue 에서 선언한 a,b member 값을 전달했으나 원래값(메소드안에서 선언하는값)을 출력하는데 의미가있는건가 ??
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("member.name="+member.name);
	}
	
	
	public void passByValue(int a, String b, Member_DTO member){
		a= 20;
		b= "z";
		//member =new Member_DTO("Singchoon");
		member.name = "Sungchoon"; // pass by reference 
									//참조자료형안에있는 객체를 변경하면 메소드에서 변경한대로 따라서 바뀐다 (값이아니라 객체에 대한참조가 넘어감(?))
		System.out.println("passByValye method result !!!");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("member.name="+member.name);
	}
	public void calculateNumbers(int... numbers){
		int total =0;
		for(int number:numbers){ //??????
			total+=number;
		}
		System.out.println("Total="+total);
	}
}



