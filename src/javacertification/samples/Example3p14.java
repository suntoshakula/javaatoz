package javacertification.samples;

public class Example3p14 {
	
	public static void main(String[] args) {
		int[][] ds = {{8,4},{6,3,2},{7}};
		int min = findMin(ds[0]);
		for(int index=1;index<ds.length;++index) {
			
			int minr = findMin(ds[index]);
			if (min > minr)
				min = minr;
		}
		System.out.println("min "+min);
	}

	private static int findMin(int[] is) {
		// TODO Auto-generated method stub
		int min = is[0];
		System.out.println("elements scan ");
		for(int i =1;i<is.length;++i)
			System.out.print(is[i]+ " ");
		System.out.println();
		for(int i = 1;i<is.length;++i)
			min = Math.min(min,is[i]);
		return min;
	}

	

}
