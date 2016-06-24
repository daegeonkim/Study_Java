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
		reference.makeStaticBlockObject();
		
		
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







}