package methodoverloading.type;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	}

class AddDiffType{
	
	static int addIntType(int a, int b) {
		return a + b;
	}
	static double addDoubleType(double a, double b) {
		return a +b;
	}
}

public class OverloadingType {

	public static void main(String[] args) {
		System.out.println("method  main overloading");
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		System.out.println(AddDiffType.addIntType(11, 11));
		System.out.println(AddDiffType.addDoubleType(11,11));
	}
	
	public static void main(String args) {
		System.out.println("main with string");
	}
	public static void main() {
		System.out.println("main without args");
	}

}
