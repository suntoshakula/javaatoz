
package javacertification.samples;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

public class Example4p2 {
	
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double squareroot = sqrt(y);
		double hyp = Math.hypot(x, y);
		double are = PI*y*y;
		System.out.println("area "+are);
		System.out.println("hyp "+hyp);
		System.out.println("squareroot "+squareroot);
		
	}
	
	

}
