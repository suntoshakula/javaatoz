package exception.type;

public class UserDefinedEx {
	
	public static void main(String[] args) {
		
		CheckingAmount c = new CheckingAmount(101);
		System.out.println("depost 500");
		c.deposit(500);
		
		try {
			System.out.println("\n withdrawing 100");
			c.withdraw(100);
			c.withdraw(600);
		}catch(FundException e) {
			System.out.println("sorry short "+e.getAmount());
			e.printStackTrace();
		}
	}

}
