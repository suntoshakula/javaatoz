package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyCheckedCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>();
		List myseclist = new ArrayList();

		myList.add("one");
		myList.add("two");
		myList.add("three");

		myseclist.add("one");
		myseclist.add("two");
		myseclist.add("three");

		Collection<String> chcklist = Collections.checkedCollection(myList, String.class);
		System.out.println("view only " + chcklist);
		myList.add("new ele");
		chcklist.add("newchckli ele");
		System.out.println(chcklist);

		Collection chckseclist = Collections.checkedCollection(myseclist, String.class);
		myseclist.add(10);
		System.out.println(myseclist);
		
		chckseclist.add("abc");
		chckseclist.add(10);
		System.out.println(chckseclist);

	}

}
