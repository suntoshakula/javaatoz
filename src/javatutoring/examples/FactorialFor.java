package javatutoring.examples;

public class FactorialFor {

	public static void main(String[] args) {
		long n, fact = 1;
		n = Long.parseLong(args[0]);

		for (int loopCnt = 1; loopCnt <= n; loopCnt++) {
			fact = fact * loopCnt;
		}
		
		System.out.println("factorial= "+fact);
	}

}
