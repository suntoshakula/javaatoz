package javacertification.samples;

public class Example3p2 {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	public Example3p2(int noOfWatts, boolean indicator, String site) {
		
		String location;
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		location = site;
		this.superFluous();
		superFluous();
		
	}

	public void superFluous() {
		// TODO Auto-generated method stub
		System.out.println(this);
		System.out.println("no of watts"+this.noOfWatts);
		System.out.println("no of watts"+this.indicator);
		System.out.println("no of watts"+this.location);
	}
	
	public static void main(String[] args) {
		Example3p2 ex  = new Example3p2(100,true,"loft");
		System.out.println("no of watts"+ex.noOfWatts);
		System.out.println("no of watts"+ex.indicator);
		System.out.println("no of watts"+ex.location);
		
	}

}
