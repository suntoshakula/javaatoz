package javatutoring.examples;

import java.util.Scanner;

class FibonacciWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of terms");
		int n = sc.nextInt();
		int first = 0, second = 1, nextTerm;
		int i =0;
		System.out.println("Fibonacci series is ");
		while(i<n) {
			if(i<=1) {
				nextTerm = i;
			}
			else {
				nextTerm = first + second;
				first = second;
				second = nextTerm;
			}
			
			System.out.println(nextTerm);
			i++;
		}
		
	}
}