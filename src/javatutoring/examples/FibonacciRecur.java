package javatutoring.examples;

import java.util.Scanner;

class FibonacciRecur {

	int first = 0, second = 1, nextTerm;
	int cnt = 0;

	public void fibRec(int n) {
		if (n > 0) {
			if (cnt <= 1) {
				nextTerm = cnt;
			} else {
				nextTerm = first + second;
				first = second;
				second = nextTerm;
			}

			System.out.print(nextTerm + " ");
			cnt++;
			fibRec(--n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FibonacciRecur fr = new FibonacciRecur();
		System.out.println("enter number of terms");
		int n = sc.nextInt();
		fr.fibRec(n);
		sc.close();

	}

}