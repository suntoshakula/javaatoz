package javacertification.samples;

public class Example3p7 {

	public static void main(String[] args) {
		double[] storeMin = new double[5];
		double min =0;
		double[] trialA = new double[15];
		for (int i = 0; i < storeMin.length; ++i) {
			randomize(trialA);
			storeMin[i] = findMin(trialA);
		}
		for(int i =0;i<storeMin.length;++i) {
			System.out.println(storeMin[i]);
		}
	}

	private static void randomize(double[] trialA) {
		// TODO Auto-generated method stub
		for (int i = 0; i < trialA.length; ++i) {
			trialA[i] = Math.random() * 100.0;

		}
	}
	
	public static double findMin(double[] valArr) {
		
		double minValue = valArr[0];
		for(int i = 1;i<valArr.length;++i) {
			minValue = Math.min(minValue,valArr[i]);
		}
		return minValue;
	}

}
