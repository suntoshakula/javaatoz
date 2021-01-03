package a.javaexamples;

class FreshJuice{
	enum FreshJuiceSize{SMALL,MEDIUM, LARGE}
	FreshJuiceSize size;
	
}

public class EnumA {
	
	public static void main(String[] args) {
		
		FreshJuice fj = new FreshJuice();
		fj.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("size "+fj.size);
		
		fj.size = FreshJuice.FreshJuiceSize.SMALL;
		System.out.println("size "+fj.size);
		
		fj.size = FreshJuice.FreshJuiceSize.LARGE;
		System.out.println("size "+fj.size);
		
		
	}

}
