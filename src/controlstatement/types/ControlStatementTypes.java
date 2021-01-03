package controlstatement.types;

public class ControlStatementTypes {
	
	/*
	if-else, if, nested if, swtich,
	while, do-whil, for, for-each,
	break, continue, 
	*/
	public static void main(String[] s) {
		
		ifelse();
		cont();
	
	}

	private static void cont() {
		// TODO Auto-generated method stub
		
		for(int k = 5; k<15;k++) {
			if(k%2!=0)
				continue;
			System.out.println(k + " ");
		}
		
	}

	private static void ifelse() {
		// TODO Auto-generated method stub
		int a = 15;
		if(a>20) {
			System.out.println("a is greater than 20");
		}else {
			System.out.println("a is less than 20");
		}
	}

}
