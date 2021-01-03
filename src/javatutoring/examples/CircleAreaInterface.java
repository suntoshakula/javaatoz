package javatutoring.examples;

import java.util.Scanner;

interface AreaCal{
	void circle(double r);
}

public class CircleAreaInterface implements AreaCal{
	
	double area;
	
	
	public void circle(double r) {
		// TODO Auto-generated method stub
		
		area = (22*r*r)/7;
		
	}
	
	public static void main(String[] args) {
		
	CircleAreaInterface aoc;
	Scanner scan = new Scanner(System.in);
	double r = scan.nextDouble();
	aoc = new CircleAreaInterface();
	aoc.circle(r);
	System.out.println("area is "+aoc.area);
	scan.close();
		
	}

}
