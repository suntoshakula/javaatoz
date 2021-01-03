package collection.treeset;

import java.util.TreeSet;

import collection.MyComp;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>(new MyComp());
		ts.add("one");
		ts.add("two");
		ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        System.out.println(ts);

	}

}
