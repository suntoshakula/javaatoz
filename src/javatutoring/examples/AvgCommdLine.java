package javatutoring.examples;

public class AvgCommdLine {

	public static void main(String[] args) {
		long n;
		int i;
		double res=0;
		n=args.length;
		for(i=0;i<n;i++) {
			res = res+Integer.parseInt(args[i]);
		}
		System.out.println("avg is "+res/n);
	}
}
