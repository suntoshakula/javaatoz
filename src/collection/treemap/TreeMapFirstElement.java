package collection.treemap;

import java.util.TreeMap;

import collection.Empl;
import collection.MyNameComp;

public class TreeMapFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Empl, String> trmap = new TreeMap<Empl,String>(new MyNameComp());
		trmap.put(new Empl("ram",3000), "ram");
		trmap.put(new Empl("patricia",4300), "patricia");
		System.out.println(trmap);
		System.out.println(trmap.firstEntry());
		System.out.println(trmap.firstEntry().getValue());
		System.out.println(trmap.firstEntry().getKey());
		System.out.println(trmap.firstKey());
	}

}
