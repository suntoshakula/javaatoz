package javatutoring.examples;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double area = (22*r*r)/7;
		System.out.println("area is "+ area);			
		s.close();
	}
}
