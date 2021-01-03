package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SyncSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		Set<String> syncset = Collections.synchronizedSet(s);
		System.out.println("sync are not created"+syncset);

	}

}
