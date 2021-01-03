package javatutoring.examples;

import java.util.Scanner;

public class AvgUserDefined {

	public static void main(String[] args) {

		int n;
		double res = 0;
		Scanner s = new Scanner(System.in);
		int a[] = new int[s.nextInt()];
		for (int i = 0; i < 4; i++) {
			a[i] = s.nextInt();
		}
		res = calAvg(a, 4);
		System.out.println("avg is " + res / 4);
		
		for (int i = 0; i < 4; i++) {
			System.out.println(a[i]);
		}

	}

	private static double calAvg(int[] a, int n) {
		// TODO Auto-generated method stub
		double res = 0;
		for (int i = 0; i < n; i++) {
			res = res + a[i];
		}
		a[2]=5;
		return res;
	}

}
