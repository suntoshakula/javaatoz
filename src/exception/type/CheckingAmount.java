package exception.type;

public class CheckingAmount {
	
	private double balance;
	private int number;
	public CheckingAmount(int number) {
		this.number = number;
		
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws FundException{
		
		if(amount<=balance) {
			balance -=amount;
		}else {
			double needs = amount -balance;
			throw new FundException(needs);
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
