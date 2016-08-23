package sis.studentinfo;

import junit.framework.TestCase;

public class SerializationTest extends TestCase{
		
	public void testLoadToNewVersion() throws Exception{
		CourseCatalog catalog = new CourseCatalog();
		catalog.load("CourseCatalogTest.testAdd.txt");
		assertEquals(2, catalog.getSessions().size());
	}
	
	
	//직렬화  이후 클래스를 변경하면(필드 추가/제거, 클래스이름변경, 메소드 등)호환이 불가한 내용을 테스하기위해 Session 객체에 name 을 추가하고
	// invaildClassException예외가 발생하는것을 확인
	// 이후 예외가 발생하는 이유는 객체를 비교할때 객체를 기반으로  serialVersionUID 라는 long 값을 생성하여 비교하는 내용을 설명하며
	// Session클래스 내에서 UID를 임의로 설정할수있다는 내용과 함께 session 에서 UID = 1L 로 설정하여 테스트 를 패스한다는내용이있는데 패스가 되지않음
	

}
