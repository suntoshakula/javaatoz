package javatutoring.examples;

import java.util.Scanner;

class CalculateDiscount{
	double amount;
	CalculateDiscount(double marketplace, double s){
		amount = (s*marketplace)/100;
	}
}

public class DiscountScanner {
	
	public static void main(String[] args) {
		double dis, marketprice, s;
		Scanner sc = new Scanner(System.in);
		marketprice = sc.nextDouble();
		dis = sc.nextDouble();
		s = 100-dis;
		CalculateDiscount cd = new CalculateDiscount(marketprice, s);
		System.out.println(cd.amount);
		sc.close();
		
	}

}
