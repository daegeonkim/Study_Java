package sis.studentinfo;

import junit.framework.TestCase;
import java.math.BigDecimal;

public class AccountTest extends TestCase {
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
	

}
