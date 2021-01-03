package javacertification.samples;

public class Example2p1 {
	
	static int counter;
	int noOfWatts = 100;
	boolean indicator;
	String location;
	public static void main(String[]args) {
		Example2p1 bulb = new Example2p1();
		System.out.println("static variable counter: "+Example2p1.counter);
		System.out.println("instance variable: "+ bulb.noOfWatts);
		System.out.println("instance variable: "+ bulb.indicator);
		System.out.println("instance variable: "+ bulb.location);
	}

}
