package collection.treeset;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemovDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"one","two","three","four","two"};
		List<String> ls = Arrays.asList(array);
		System.out.println(ls);
		TreeSet<String> ts = new TreeSet<String>(ls);
		System.out.println(ts);
		

	}

}
