package javatutoring.examples;

import java.util.Scanner;

public class TriangleAreaIsoscles {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double d = s.nextDouble();
		Double r = s.nextDouble();
		Double area = (r/4)*Math.sqrt((4*d*d)-(r*r));
		System.out.println("area of isosceles triangle "+area);
	}

}
