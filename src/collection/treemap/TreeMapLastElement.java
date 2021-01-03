package collection.treemap;

import java.util.Map.Entry;
import java.util.TreeMap;

import collection.Empl;
import collection.MySalaryComp;

public class TreeMapLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Empl, String> trmap = new TreeMap<Empl,String>(new MySalaryComp());
		
		trmap.put(new Empl("Ram",3000), "Ram");
		trmap.put(new Empl("Jack", 1200), "Jack");
		System.out.println(trmap);
		System.out.println(trmap.lastKey());
		Entry<Empl,String> e = trmap.lastEntry();
		System.out.println(e.getValue());
		System.out.println(e.getKey());
		

	}

}
