package collection.linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LhsBasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		lhs.clear();
		System.out.println(lhs);
		
		//adding subset
		HashSet<String> shs = new HashSet<String>();
		shs.add("s1");
		shs.add("s2");
		lhs.addAll(shs);
		System.out.println(lhs);
		
		
		LinkedHashSet<String> lhsk = new LinkedHashSet<String>();
        //add elements to HashSet
        lhsk.add("first");
        lhsk.add("second");
        lhsk.add("third");
        System.out.println(lhsk);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        lhsk.addAll(subSet);
        System.out.println("LinkedHashSet content after adding another collection:");
        System.out.println(lhsk);
		
        Iterator<String> itr = lhsk.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }

	}

}
