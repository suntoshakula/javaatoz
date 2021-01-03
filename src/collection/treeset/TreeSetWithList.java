package collection.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		System.out.println(ls);
		
		TreeSet<String> ts = new TreeSet<String>(ls);
		System.out.println(ts);

	}

}
