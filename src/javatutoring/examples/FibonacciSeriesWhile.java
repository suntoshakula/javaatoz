package javatutoring.examples;

import java.util.Scanner;

public class FibonacciSeriesWhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0, nextTerm;
		int b = 1;
		for (int c = 0; c < n; c++) {
			if(c<=1)
			nextTerm=c;
			else {
				nextTerm=a+b;
				a=b;
				b=nextTerm;
			}
			System.out.println(nextTerm);
		}

	}
}
