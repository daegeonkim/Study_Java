package Chapter_7;

public class Q_7 {

	public static void main(String[] args) {
		
		Q_7 BB = new Q_7();
		BB.setData(); // 메소드 호출을 안할경우 
		BB.printHeight(1);//이경우에도 gradeHeight의 값을 지정해주는 메소드를 호출하지않으면 값이 없기때문에 nullpoint 오류가 출력된다(동규형한테 배웠었음)
		System.out.println("----------");
		for(int loop=1;loop<6;loop++){
		//	System.out.println("ClassNo: "+loop);
			//BB.printHeight(loop);  //프린트 내에서는 객체 메소드를 부를수가없다 이전에 책에서봤는데 기억이안난
			BB.printAverage(loop);
		}
		
		
		//**테스트 : System.out.println(BB.gradeHeight);// 사용할수가없다 / 이유가뭘까 데이터를 지정한다 ?
		//먼저 setData메소드를 부르지않을경우는 gradeHeight 에 할당된값이 없기때문에 출력시  null 값이 나옴
		
	}
	int [][] gradeHeight; // 밖에서 선언  ?/
	public void setData(){  
		gradeHeight = new int [5][];
		gradeHeight[0] = new int[] { 170, 180, 173, 175, 177 };
		gradeHeight[1] = new int[] { 160, 165, 167, 186 };
		gradeHeight[2] = new int[] { 158, 177, 187, 176 };
		gradeHeight[3] = new int[] { 173, 182, 181 };
		gradeHeight[4] = new int[] { 170, 180, 165, 177, 172 };
	}

	
	public void printHeight(int classNo){ // 클래스 넘버로 어떻게받지 변수는 숫자로 만들수없는데 . 메소드 내에서 메소드 어떻게부르더라 ..
											// 불렀는데 그안에데이터를 왜쓸수없는걸까리턴해야되는거아닌가 
		for(int	data : gradeHeight[classNo-1]){
				System.out.println(data);			
		}
	}
	public void printAverage(int classNo) {
		System.out.println("ClassNo." + classNo);
		double sum=0;
		int studentCount=gradeHeight[classNo - 1].length;
		for (int data : gradeHeight[classNo - 1]) {
			sum+=data;
		}
		System.out.println(sum/studentCount);
	}
}
