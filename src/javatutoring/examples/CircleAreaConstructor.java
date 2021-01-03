package javatutoring.examples;

import java.util.Scanner;

class Area{
	double area;
	Area(double r){
		area = (22*r*r)/7;
	}
}

public class CircleAreaConstructor {
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		Area a = new Area(r);
		System.out.println("area is "+ a.area);
	}

}
