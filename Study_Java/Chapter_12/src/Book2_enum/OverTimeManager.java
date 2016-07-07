package Book2_enum;

public class OverTimeManager {
	public static void main(String[] args) {
		OverTimeManager test = new OverTimeManager();
	//	int myOverTime = test.getOverTimeAmount(OvertimeValues.THREE_HOUR);
	//	System.out.println(myOverTime);
		OvertimeValues2 test2 = OvertimeValues2.FIVE_HOUR; // 왜 이렇게하는걸까, 이건 뭘의미하는걸까 .. 이렇게쓰는건 처음봄 // 상수 할당이라고는 한 // 생성자를 이미 만들어나서 기본생성자가 없기때문에 컴파일안되는건
		System.out.println(test2);
		System.out.println(test2.getAmount());
		
		
		OvertimeValues2 value3 = OvertimeValues2.THREE_HOUR;
		System.out.println(test2.compareTo(value3)); // 테스트2의 값과 벨류3의 타입과 순서의 차이를 리턴한다
		// 출력값은 1, 한칸차이난다는 의미
		
		OvertimeValues2 [] valueList =OvertimeValues2.values();// values?? enum클래스 내에있는건가
		for(OvertimeValues2 value : valueList){
			System.out.println(value);
		}
	
	
	}

	
	
	public int getOverTimeAmount(OvertimeValues value){ // OvertimeValues 에서 값을 받아와
		int amount=0; // 어마운트를 0으로 초기
		System.out.println(value); //받은 매개변수를 출력하
		switch(value){ // 매개변수에 맞는 값을스위치문으로 나눠
		case THREE_HOUR:
			amount=1;
			break;
		case FIVE_HOUR:
			amount =2;
			break;
		case WEEKEND_FOUR_HOUR:
			amount = 3; 
			break;
		}
		return amount; // 해당하는스위치의 값을 리턴한다
	}
	
	
}
