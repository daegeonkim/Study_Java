package Book2_enum;

public enum OvertimeValues2 {
	THREE_HOUR(18000), 
	FIVE_HOUR(30000), 
	WEEKEND_FOUR_HOUR(40000), 
	WEEKEND_EIGHT_HOUR(60000);
	private final int amount;

	OvertimeValues2(int amount) { // 생성
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
