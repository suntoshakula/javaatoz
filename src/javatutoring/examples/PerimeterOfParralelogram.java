package javatutoring.examples;

public class PerimeterOfParralelogram {
	
	public static void main(String[] args) {
		
		double ha = Double.parseDouble(args[0]);
		Double hb = Double.parseDouble(args[1]);
		double perimeter = 2*(ha+hb);
		System.out.println("perimeter "+ perimeter);
		System.out.println("typeof "+ hb instanceof String);
				
	}

}
