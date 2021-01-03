package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationWColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = new ArrayList<String>();
		ls.add("one");
		ls.add("two");
		Enumeration<String> rtnenum = Collections.enumeration(ls);
		while(rtnenum.hasMoreElements()) {
			System.out.println(rtnenum.nextElement());
		}

	}

}
