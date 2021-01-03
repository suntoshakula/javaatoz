package javacertification.samples;

class Pizza{
	String meat ="beef";
}

public class Example3p11 {
	
	public static void main(String[] args) {
		
		Pizza pf = new Pizza();
		System.out.println("meat on pizza "+pf.meat);
		bake(pf);
		System.out.println("meat on pizza "+pf.meat);
		
	}

	private static void bake(Pizza pf) {
		// TODO Auto-generated method stub
		pf.meat ="chicken";
		pf = null;
		
	}

}
