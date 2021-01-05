package javacertification.samples;


class Light13{
	int nw;
	boolean indicator;
	String location;	
	static int counter;
	
	
	public Light13(int nw, boolean indicator, String location) {
		// TODO Auto-generated constructor stub
		this.nw = nw;
		this.indicator = indicator;
		this.location = location;
		++counter;
	}

	public static void writeCount() {
		// TODO Auto-generated method stub
		System.out.println("no of lights "+counter);
	
	}
}
public class Example4p13 {
	
	public static void main(String[] args) {
		Light13.writeCount();
		
		Light13 l = new Light13(100,true,"basement");
		System.out.println("vof "+Light13.counter);
		
		Light13 l2 = new Light13(200,false,"garage");
		l2.writeCount();
		Light13 l3 = new Light13(300,true,"kitchen");
		System.out.println("vof "+l3.counter);
		
		
		
	}

}
