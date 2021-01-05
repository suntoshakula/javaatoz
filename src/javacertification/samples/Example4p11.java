package javacertification.samples;

abstract class Light{
	int nw;
	boolean indicator;
	String location;
	public void switchOn() {indicator=true;}
	public void switchOff() {indicator=false;}
	public boolean isOn() {return indicator;}
    
	abstract public double kwhPrice();
}
class TubeLight extends Light{

	@Override
	public double kwhPrice() {
		// TODO Auto-generated method stub
		return 2.75;
	}
	
	
}
public class Example4p11 {
	
	public static void main(String[] args) {
		TubeLight cl = new TubeLight();
		Light l;
		l = cl;
		System.out.println("tubelight "+l.kwhPrice());
		
	}
	
	

}
