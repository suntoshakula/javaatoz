package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MycheckedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set myset = new HashSet();
		myset.add("one");
		myset.add("two");
		myset.add(10);
		System.out.println(myset);
		Set myretset = Collections.checkedSet(myset, String.class);
		System.out.println(myretset);
		myretset.add(10);
		
		

	}

}
