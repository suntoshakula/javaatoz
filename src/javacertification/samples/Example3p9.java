package javacertification.samples;

public class Example3p9 {
	
	public static void main(String[] args) {
		int[][] mxnArray = {
				{16,7,12},
				{9,20,18},
				{14,11,5},
				{8,5,10},
		};
		
		int min = mxnArray[0][0];
		for(int i =0;i<mxnArray.length;++i) 
			for(int j =0;j<mxnArray[i].length;++j) 
				min = Math.min(min, mxnArray[i][j]);
		
		System.out.println("min valu" + min);
	}

}
