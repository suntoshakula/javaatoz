package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class ReadUsingIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("one");
		ts.add("two");
		ts.add("three");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
