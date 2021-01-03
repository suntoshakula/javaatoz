package javatutoring.examples;

import java.util.Scanner;

class CalculatBill{

	double billPay;

	void bill(long units) {

		if (units < 100)
			billPay = units * 1.20;
		else if (units <= 300)
			billPay = 100 * 1.20 + (units - 100) * 2;
		else if (units > 300)
			billPay = 100*1.20+200 * 2 + (units-300)*3;
	}
	
}
	public class ComputeElectricityBill extends CalculatBill{
		
		public static void main(String[] args) {
			
			long units;
			Scanner inp = new Scanner(System.in);
			System.out.println("please enter units");
			units = inp.nextLong();
			ComputeElectricityBill ceb = new ComputeElectricityBill();
			ceb.bill(units);
			
			System.out.println("bill values is "+ ceb.billPay);
		}
	}

