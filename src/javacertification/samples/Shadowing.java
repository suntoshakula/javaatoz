package javacertification.samples;

public class Shadowing {
	static int x;
	public static void main(String[] args) {
		x =5;
		System.out.println(x);
		int x  = 10;
		System.out.println(x);
	}

}
