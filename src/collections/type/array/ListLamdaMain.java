package collections.type.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ListLamdaMain {

	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<String>();
		list.add("sun");
		list.add("moon");
		list.add("star");
		list.add("french");
		
		System.out.println("traversing");
		
		java.util.ListIterator<String> ltr = list.listIterator(list.size());
		while(ltr.hasPrevious()) {
			String str = ltr.previous();
			System.out.println(str);
		}
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.forEach(a->{
			System.out.println(a);
		});
		
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
		
	}
}
