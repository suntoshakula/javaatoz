package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisjointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		List<String> cmp = new ArrayList<String>();
		cmp.add("c");
		cmp.add("d");
		boolean rtn = Collections.disjoint(lst, cmp);
		System.out.println(rtn);
		cmp.add("a");
		boolean rtn2 = Collections.disjoint(lst, cmp);
		System.out.println(rtn2);

	}

}
