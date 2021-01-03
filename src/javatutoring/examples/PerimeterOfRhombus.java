package javatutoring.examples;

import java.util.Scanner;

public class PerimeterOfRhombus {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Double r = s.nextDouble();
		Double p = area(r);
		System.out.println("perimeter is "+ p);
		s.close();		
	}

	static Double area(Double r) {
		// TODO Auto-generated method stub
		Double p = 4*r;
		return p;
	}

}
