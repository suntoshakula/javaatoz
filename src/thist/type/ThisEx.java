package thist.type;

public class ThisEx {
	
	int a;
	int b;
	
	public ThisEx() {
		// TODO Auto-generated constructor stub
		this( 10,20);
	}
	
	public ThisEx(int a, int b)	 {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a = "+a+" b= "+b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("this example");
		ThisEx object = new ThisEx(10,20);
		object.display();
		ThisEx tex = new ThisEx();
		tex.display();
		
	}

}
