package collection.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enum2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> enuvec = new Vector<String>();
		enuvec.add("a");
		enuvec.add("b");
		Enumeration<String> enumE  = enuvec.elements();
		List<String> ll = Collections.list(enumE);
		System.out.println(ll);
		
		

	}

}
