package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class BasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("kbc");
		hs.add("kcr");
		System.out.println(hs);
		hs.remove("kcr");
		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
