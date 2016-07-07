package Book2;

public final class FinalClass {
	final Member_DTO dto = new Member_DTO();
	
	
	public static void main(String[] args) {
		FinalClass cls = new FinalClass();
		cls.check_DTO();
	}
	public void check_DTO(){
		System.out.println(dto);
		//dto = new Member_DTO(); // 두번이상 값을 할당하거나 새로 생성자를 사용하여 초기화 불가하
		dto.name = "Dennis"; // 생성자 final  로 생성했지만 DTO안에 객들은 Final 이 아님으로 변경 가능하다.
		System.out.println(dto);
		
	}

}
