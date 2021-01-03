package javatutoring.examples;

import java.util.Scanner;

public class CircleAreaMethod {	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		System.out.println("area of circle is " + area(r));		
		s.close();
	}
	
	  static Double area(Double r) {
			Double a = (22*r*r)/7;	
			return a;
		}
}
