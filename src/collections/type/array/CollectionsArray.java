package collections.type.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsArray {
	
	public static void main(String[] args) {
		ArrayList<String> list =  new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("d");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		System.out.println("elememnt at 0 "+list.get(1));
		list.set(2,"dates");
		System.out.println("elememnt at 0 "+list.get(2));
		
		List<String> l = new ArrayList<String>();
		l.add("mango");
		l.add("apple");
		l.add("banana");
		Collections.sort(l);
		for(String f: l) {
			System.out.println(f);
		}
		
	}

}
