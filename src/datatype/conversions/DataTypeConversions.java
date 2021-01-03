package datatype.conversions;

public class DataTypeConversions {
	
	public static void main(String[] args) {
		
		/* implicit conversion */
		System.out.println("hello world");
		int i = 100;
		long l = i;
		float f =l;
		System.out.println("int "+i);
		System.out.println("long "+l);
		System.out.println("float "+f);
		
		/*explicit conversion*/
		char ch = 'c';
		double d = 100.04;
		long lg = (long)d;
		int in  = (int)lg;
		
		int num = 88;
		ch = (char)num;
		System.out.println("char of 88 "+ch);
		System.out.println("double "+d);
		System.out.println("long  "+lg);
		System.out.println("int "+in);
	}

}
 