package operators.types;

public class OperatorsType {
	
	public static void main(String[] args) {
		/*
		unary, arithmetic, shift
		relational, bitwise, logical, ternary, assignm
		*/
		int x = 10;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);
		System.out.println(x++ + ++x);
		System.out.println(x);
		System.out.println(~x);
	}

}
