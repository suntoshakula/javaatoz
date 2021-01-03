package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("b");
		ls.add("c");
		
		List<String> sls = new ArrayList<String>();
		sls.add("b");
		sls.add("c");
		
		System.out.println("index of sublist: "+Collections.indexOfSubList(ls, sls));
		System.out.println("last "+Collections.lastIndexOfSubList(ls, sls));
		
		sls.clear();
		System.out.println(sls);
		sls.add("a");
		sls.add("c");
		System.out.println(Collections.indexOfSubList(ls, sls));
		
		sls.clear();
		sls.add("z");
		sls.add("e");
		System.out.println(Collections.indexOfSubList(ls, sls));
		
		
		
	}

}
