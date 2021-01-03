package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		System.out.println(ls);
		Collections.fill(ls,"fill list");
		System.out.println(ls);

	}

}
