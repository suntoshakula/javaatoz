package collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class SubListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROWN");
        ts.add("YELLOW");
        System.out.println(ts);
        Set<String> subSet = ts.subSet("GREEN", "WHITE");
        System.out.println("sub set"+subSet);
        subSet = ts.subSet("GREEN",true,"WHITE",true);
        System.out.println(subSet);
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("GREEN", false, "WHITE", true);
        System.out.println(subSet);
        
        
		
	}

}
