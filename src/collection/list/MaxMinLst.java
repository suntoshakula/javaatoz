package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		System.out.println("list "+Collections.max(ls));
		
		List<Integer> intls = new ArrayList<Integer>();
		intls.add(1);
		intls.add(2);
		intls.add(100);
		System.out.println("list "+Collections.max(intls));
		System.out.println("least "+Collections.min(intls));

	}

}
