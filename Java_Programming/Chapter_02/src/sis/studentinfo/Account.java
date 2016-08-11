package sis.studentinfo;

import java.math.BigDecimal;


public class Account {
	private BigDecimal balance = new BigDecimal("0.00");
	private int transactionCount =0;
	
	public void credit(BigDecimal amount){
		balance = balance.add(amount);
		transactionCount++;
	}
	
	public BigDecimal getBalance(){
		return balance;		
	}

	public BigDecimal transactionAverage() {
		return balance.divide(new BigDecimal(transactionCount), BigDecimal.ROUND_HALF_DOWN);
	}
	
}
