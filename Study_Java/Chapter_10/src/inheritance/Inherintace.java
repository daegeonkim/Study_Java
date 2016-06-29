package inheritance;

public class Inherintace {
	public static void main(String[] args) {
		Child child = new Child();
		//child.printName();
		Inherintace test = new Inherintace();
		// 상속될경우, 부모클래스에서 기본생성자가 호출되고, 자식클래스의 생성자가 호출된다.
		// 이후실행하는 메소드가 실행된다.
		test.objectCast2();
		Child aa = new Child();
		aa = Parent;
		
	}
	public void objectCast (){
		//Parent parent  = new Parent();
		Child child = new Child();
		Parent parent2 =child;
		
//		Praent parent2 = child;
	//	Child child2 = parent;
		// 이렇게 형변환을 할수없다. 선언한 객체이기때문에
		//Child child2 =(Child)parent;
		Child child2 =(Child)parent2;
	}
	
	
	public void objectCast2(){
		Parent[] parentArray = new Parent[3];
		parentArray[0] = new Child();
		parentArray[1] = new Parent();
		parentArray[2] = new Child();

		for(Parent tempParent:parentArray){
			if(tempParent instanceof Child){
			//	System.out.println("Child");
				Child tempChild = (Child)tempParent;
				tempChild.printAge();
			}else if(tempParent instanceof Parent){
				//System.out.println("Parent");
				Child tempChild = (Child)tempParent;
				tempChild.printAge();
				
			}
		}		
	}
	
	
	public void callPrintName(){
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new ChildOther();
	
		parent1.printName();
		parent2.printName();
		parent3.printName();
	}
	
}
