package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> all = new ArrayList<String>();
		all.add("java");
		all.add("java");
		all.add("perl");
		all.add("c");
        all.add("c++");
        all.add("unix");
        all.add("perl");
        all.add("php");
        all.add("javascript");
        all.add("ruby");
        all.add(".net");
		System.out.println(all);
		Collections.rotate(all, 3);
		System.out.println(all);

	}


}
