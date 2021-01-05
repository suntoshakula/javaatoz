package javacertification.samples;

import static java.util.Collections.binarySearch;
import static java.util.Arrays.binarySearch;
import static javacertification.samples.Auxiliary.binarySearch;

public class Example4p6 {
	
	public static void main(String[] args) {
		int index = binarySearch(new int[] {10,20,30},50);
		System.out.println(index);
	}

	private static int binarySearch(int[] a, int key) {
		// TODO Auto-generated method stub
		System.out.println("class main");
		return -1;
	}

}
