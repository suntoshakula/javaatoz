package javacertification.samples;

public class Example3p12 {

	public static void main(String[] args) {
		int[] ds = { 6, 4,8, 2, 1 };
		printInA(ds);
		for(int i = 1; i<ds.length;++i)
			if(ds[i-1]>ds[i])
				swap(ds,i-1,i);
		printInA(ds);

	}

	private static void swap(int[] ds, int i, int i2) {
		// TODO Auto-generated method stub
		
		int tmp = ds[i];
		ds[i] = ds[i2];
		ds[i2] = tmp;
		
	}
	
	

	private static void printInA(int[] ds) {
		// TODO Auto-generated method stub

		for (int v : ds)
			System.out.print(" " + v);
		System.out.println();

	}

}
