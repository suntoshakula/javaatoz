package javacertification.samples;

public class Example2p2 {
	public static void main(String[] args) {
		int weight = 10, thePrice=0;
		if(weight<10) thePrice = 1000;
		if(weight>50) thePrice = 5000;
		if(weight>=10) thePrice = weight*10;
		System.out.println("price is: "+thePrice);
	}

}
