package inheritance;

public class SubClass extends SuperClass{
	
	int num = 10;
	
	public void display() {
		System.out.println("this is the display method of subclass");
	}
	
	public void subclassmethods() {
		
		SubClass subClass = new SubClass();
		subClass.display();
		super.display();
		System.out.println("variable subclass");
		System.out.println(subClass.num);
		System.out.println("variable superclass");
		System.out.println(super.num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass subClass = new SubClass();
		subClass.subclassmethods();
	}

}
