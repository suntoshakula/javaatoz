package string.type.ex;

public class StringType {
	
	public static void main(String[] args) {
		String s = " sachin tendulkar ";
		System.out.println(s.substring(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		s.concat("hero");
		System.out.println(s);
		StringBuffer sb = new StringBuffer("santosh here");
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		System.out.println("stringbuffer is mutable");
	}

}
