package javacertification.samples;

public class Example3p13 {
	
	public static void main(String[] args) {
		int[] ds = {6,4,8,2,1};
		int min = ds[0];
		for(int index=1;index<ds.length;++index)
			min = min(min, ds[index]);
		System.out.println("min "+min);
	}

	private static int min(int min, int i) {
		// TODO Auto-generated method stub
		return (min<=i)? min: i;
	}

}
