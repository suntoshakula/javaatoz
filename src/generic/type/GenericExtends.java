package generic.type;

public class GenericExtends {
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		
		T max  = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		System.out.printf("max %d \n",maximum(2, 3, 4));
		System.out.printf("max "+maximum(2.2, -3.0, -4.0));
	}

}
