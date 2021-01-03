package inheritance;

public class InheritanceExampleDemo1 extends InheritanceTeacher{
	
	String mainSubject = "physics";
	
	public InheritanceExampleDemo1() {
		// TODO Auto-generated constructor stub
		//super(10);
		System.out.println("Constructor of Child");
	}
	
	
	void disp() {
		System.out.println("child disp method ");
		super.disp();
	}
	public static void main(String args[]) {
		
		InheritanceExampleDemo1 demoA = new InheritanceExampleDemo1();
		System.out.println("collegeName "+demoA.getCollegeName());
		System.out.println("designation "+demoA.getDesignation());
		System.out.println("main subject "+demoA.mainSubject);
		demoA.does();	
		demoA.disp();
		
	}

}
