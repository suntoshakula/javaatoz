package javacertification.samples;

import javacertification.samples.artifacts.Ailment;

interface Magic{
	void levitate();
}

public class Clown implements Magic{
	
	LovePotion tlc;
	Ailment problem;
	public Clown() {
		// TODO Auto-generated constructor stub
		tlc = new LovePotion("passion");
		problem = new Ailment("flu");
	}

	@Override
	public void levitate() {
		// TODO Auto-generated method stub
		System.out.println("clown-levitating");
	}
	
	public void mixPotion() {
		System.out.println("mixing "+tlc);
	}
	public void healAilment() {System.out.println("healing "+problem);}
	
}