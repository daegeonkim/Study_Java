package sis.studentinfo;

public class Scorer {

	public	int score(String input) {
		return Integer.parseInt(input); //  parseInt 가  String > int 로 변환해준다  
	}

	public boolean isVaild(String input) {
		try{
			Integer.parseInt(input); // 인수를 
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}

}
