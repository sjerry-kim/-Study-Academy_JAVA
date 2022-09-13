package chap07_1_access;

// 2022.08.10.(수)
public class BankAcc {
	public String BankNum;
	private int money;
	
	public BankAcc (String s) {
		BankNum = s;
		money = 0;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	void inMoney(int a) {
		this.money +=a;
	}
	
	void outMoncy(int a) {
		this.money -=a;
	}
}
