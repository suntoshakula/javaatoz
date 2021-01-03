package collection.linkedhashset;

import java.util.LinkedHashSet;

public class LhsToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		lhs.add("first");
		String[] str = {"stra","strb","strc"};
		lhs.toArray(str);
		System.out.println(lhs);
		System.out.println(str[1]);
		lhs.remove("second");
		System.out.println(lhs);
		System.out.println("does it have "+lhs.contains("stra"));

	}

}

