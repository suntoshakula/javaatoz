package javacertification.samples;

class PizzaFactory{
	public double calPr(int np, double pz) {
		pz = pz/2.0;
		return np*pz;
	}
}

public class Example3p10 {
	
	public static void main(String[] args) {
		PizzaFactory piz = new PizzaFactory();
		int pz = 15;
		double tp = piz.calPr(4, pz);
		System.out.println("vaule "+pz);
	}

}
