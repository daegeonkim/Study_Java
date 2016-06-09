
public class Car {
	public Car(){//<<생성자 		
	}
	int speed; //int 자료형 변수 선언(??) 생성(??)
	int distance;// ""
	String color;// 스트링형 변수 컬러 생
	public void speedUp(){// 메소드 선언
		speed = speed +5;
	}	
	public void breakDown(){// 메소드 선언  
		speed = speed - 10;
	}		
	public int getCurrentSpeed(){
		return speed;
	}			
}


