package sis.studentinfo;

import junit.framework.TestCase;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import com.jimbob.ach.*;

public class AccountTest extends TestCase {
	static final String ABA = "10200012";
	static final String ACCOUNT_NUMBER = "194431518811";
	
	private Account account;
	
	protected void setUp(){
	account = new Account();
	account.setBankAba(ABA);
	account.setBankAccountNumber(ACCOUNT_NUMBER);
	account.setBankAccountType(Account.BankAccountType.CHECKING);	
	}
	
	public void testTransaction(){
		Account account = new Account();
		account.credit(new BigDecimal("0.10"));
		account.credit(new BigDecimal("11.00"));
		assertEquals(new BigDecimal("11.10"), account.getBalance());
	}
	
	public void testTransactionAverage(){
		Account account = new Account();
		account.credit(new BigDecimal("0.10"));
		account.credit(new BigDecimal("11.0"));
		account.credit(new BigDecimal("2.99"));
		assertEquals(new BigDecimal("4.70"), account.transactionAverage());
		}
 	
	public void testTransferFromBank(){ // 12과 예제관련 테스트
		//account.setAch(new com.jimbob.ach.JimBobAch()); // uh-oh
		// ㄴ testTransfer 메소드가  Moack 에 의존적이고 Moack 은 AcountTest에 의존적이기때문에 변경함
		// 아래같이 변경하여 moack 을 account 에 의존적이도록 변경하는듯
	/*	account.setAch(new MockAch());
		final BigDecimal amount = new BigDecimal("50.00");
		account.transferFromBank(amount);*/
		
//		Ach mockAch = new MockAch(){ //무명클래스를 인터페이스 구현부터 구현했으나, 
//			//필요 클래스를 구현 후 필요한 메소드만 익명클래스로 오버라이드하여 사용함
//
//			public AchResponse issueDebit(AchCredentials credentials, AchTransactionData data) {
//				assertTrue(data.account.equals(AccountTest.ACCOUNT_NUMBER));
//				assertTrue(data.aba.equals(AccountTest.ABA));
//				
//				AchResponse response = new AchResponse();
//				response.timestamp = new Date();
//				response.treaceCode = "1";
//				response.status = AchStatus.SUCCESS;
//
//				return response;
//			}
//		};
		account.setAch(createMockAch(AchStatus.SUCCESS));
		final BigDecimal amount = new BigDecimal("50.00");
		
		account.transferFromBank(amount);
		
		assertEquals(amount, account.getBalance());
	}
	//메소드 구현에 필요한클래스를 익명클래스로선언하여 단순화시킴
	
	public void testFailedTransferFromBank(){
		account.setAch(createMockAch(AchStatus.FAILURE));
		final BigDecimal amount = new BigDecimal("50.00");
		account.transferFromBank(amount);
		assertEquals(new BigDecimal("0.00"), account.getBalance());
	}

	private Ach createMockAch(final AchStatus status) {

		return new MockAch(){
			public AchResponse issueDebit(AchCredentials credentials, AchTransactionData data) {
				assertTrue(data.account.equals(AccountTest.ACCOUNT_NUMBER));
				assertTrue(data.aba.equals(AccountTest.ABA));
				
				AchResponse response = new AchResponse();
				response.timestamp = new Date();
				response.treaceCode = "1";
				response.status = status;
				
				return response;
				
			}};
	}

	public void testWithdraw() throws IOException{
		account.credit(new BigDecimal("100.00"));
		account.withdraw(new BigDecimal("40.00")); 
		assertEquals(new BigDecimal("60.00"), account.getBalance()); // 40.00 을 출금했을때 정상적으로 balance 에서 40 이 차감되는지 확인
	}
	
	public void testWithdrawInsufficientfunds(){
		account.credit(new BigDecimal("100.00"));
		account.withdraw(new BigDecimal("140.00")); // 인출금액이 100.00 이상인 경우 출금하지 않는것을 확인하는 테스트.
		assertEquals(new BigDecimal("100.00"), account.getBalance());
	}

}
