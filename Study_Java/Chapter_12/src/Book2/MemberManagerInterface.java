package Book2;

import Book2.Member_DTO;

public interface MemberManagerInterface {
	public boolean addMember(Member_DTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(Member_DTO member);
		
				
}
