package javatutoring.examples;

import java.util.Scanner;

public class FactorialDoWhile {

	public static void main(String[] args) {
		long n, fact = 1;
		Scanner s = new Scanner(System.in);
		n = s.nextLong();
		int cnt =1;
		do {
			fact = fact * cnt		;
			cnt++;
		}while(cnt<=n);
	 System.out.println("factorial "+ fact);
	}

}
