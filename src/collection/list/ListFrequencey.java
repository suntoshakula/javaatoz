package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFrequencey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<String>();
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		System.out.println(mylist);
		System.out.println("one occured "+Collections.frequency(mylist, "one"));
		System.out.println("a occured "+Collections.frequency(mylist, "a"));
		

	}

}
