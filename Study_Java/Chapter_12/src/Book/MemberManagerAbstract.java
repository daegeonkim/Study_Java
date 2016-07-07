package Book;

public abstract class MemberManagerAbstract {
	public abstract boolean addMember(Member_DTO member);
	public abstract boolean removeMember(String name, String Phone);
	public abstract boolean updateMember(Member_DTO member);	
	public void printLog(String data){
		System.out.println("DATA = "+ data);
	}
}
