package Book;

import Book.Member_DTO;

public interface MemberManagerInterface {
	public boolean addMember(Member_DTO member);
	public boolean removeMember(String name, String Phone);
	public boolean updateMember(Member_DTO member);	
	
}
