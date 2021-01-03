package collection.linkedhashset;

import java.util.LinkedHashSet;

public class RetainComapreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println(lhs);
		LinkedHashSet<String> slhs = new LinkedHashSet<String>();
		slhs.add("rat");
		slhs.add("cow");
		slhs.add("first");
		System.out.println(lhs.retainAll(slhs));
		System.out.println(lhs);
		System.out.println(slhs);
		
		System.out.println(slhs);
		System.out.println(lhs.retainAll(slhs));
		System.out.println(lhs);
	}

}
