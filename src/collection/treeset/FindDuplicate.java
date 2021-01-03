package collection.treeset;

import java.util.TreeSet;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "one", "two", "three", "four", "four", "five" };
		TreeSet<String> ts = new TreeSet();
		for (String s : strArr) {
			// System.out.println(s);
			System.out.println(ts.add(s));
			if(!ts.add(s)) {
				System.out.println(ts);
			}else {
				System.out.println(s+"duplicate");
			}

		}

	}
}
