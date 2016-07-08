package Book;

import jdk.nashorn.internal.ir.CatchNode;

public class ExceptionSample {
	public ExceptionSample(){
	}

	public static void main(String[] args) {
		ExceptionSample sample = new ExceptionSample();
		//sample.arrayOutOfBound();
		//sample.finallySample();
		sample.multiCatch();
	}	
	public void arrayOutOfBound(){
		int [] intArray = null;
		//int [] intArray = new int [5];
		try{
		intArray = new int [5]; // try 안에서 선언했기때문에 catch{} 에서는 참조 할 수 없다.
		System.out.println(intArray[5]);
	} catch(Exception e){
		//System.out.println("exception occured");
		System.out.println(intArray.length);// try 안에서 선언했기때문에 catch{} 에서는 참조 할 수 없다.
		
		}
		System.out.println("this code should run");
	}	

	public void finallySample(){
		int [] intArray = null;
		try{
		intArray = new int [5]; // try 안에서 선언했기때문에 catch{} 에서는 참조 할 수 없다.
		System.out.println(intArray[4]);
	} catch(Exception e){
		System.out.println(intArray.length);// try 안에서 선언했기때문에 catch{} 에서는 참조 할 수 없다.
		System.out.println(e); // 오류 내용을 e  에 저장하나봄
		}finally{
			System.out.println("Here is finally");
		}
		System.out.println("this code should run");
	}	

	// 출력시 0 이나오는데 0은 어디서나오는거며 왜 나오는것일까 ..catch  부분이라해도 실행되면안되는거아닌가 *예외가 없으니까. // 예로 e는 출력되지 않음
	// ㄴ 이거슨... intArray[4] 의 출력값이다... 초기화하지않았기때문에 초기값 0
	public void multiCatch(){
		int [] intArray = new int [5];
		try{
			intArray = null;
		System.out.println(intArray[5]);
	}catch (NullPointerException e){
			System.out.println("NullPointerException is occured"); //null객체를 갖고 작업하지 않았기떄문에 패스된다(해당사항이 없기때문에 패스란 얘기인)
			//ㄴ 출력값은 nullPointer 에 대한 내용이 나오는데, 이유는 어떤 내용이든  null 값으로 작업이 진행되면 안되기때문에 
			// 해당 내용이 null값인지 아닌지 가장 먼저 확인된다.
			// intArray 를 null값으로 설정했기때문에 해당 내용에 대해서 null값에 대한 예외가 발생했고, 그로인해 바로 catch 문으로 넘어갔다.
			// 이 코드를 주석 처리할경우 가장 밑에 있는 Exception 부분 catch 가 실행된다 **가장 큰 단위이기때문에 마지막에 배치하여 빠져나가는 예외값이 없도록하는게 좋다고 한다.
	}catch (ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutofBoundsException is occured");		
	}catch(Exception e){
		System.out.println("Exception occured");
	}
	//}catch (ArrayIndexOutOfBoundsException e){ // 이 경우 부모클래스인 exception  에서 예외처리를 했기때문에 그 하위 클래스인 array..는 처리할수없
		//	System.out.println("ArrayIndexOutofBoundsException is occured");	
		//}	
	}
}
