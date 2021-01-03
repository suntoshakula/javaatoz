package javacertification.samples;

public class Example3p8 {
	public static void main(String[] args) {
		System.out.println("min value: "+findMin(new int[]
				{3,4,5,2,8,6}));
	}

	private static int findMin(int[] is) {
		// TODO Auto-generated method stub
		
		int min = is[0];
		for(int index=1;index<is.length;++index)
			if(is[index]< min)
				min = is[index];
		return min;
	}

}
