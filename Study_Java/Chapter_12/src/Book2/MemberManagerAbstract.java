package Book2;

public abstract class MemberManagerAbstract {
	public	abstract boolean addMember(Member_DTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(Member_DTO member);
	public void printlog(String data){
		System.out.println("data= "+data);
	}
	//public final void printLog(String data){
		//System.out.println("data= "+data);
	//}

}
