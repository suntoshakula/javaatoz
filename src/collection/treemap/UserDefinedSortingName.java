package collection.treemap;

import java.util.TreeMap;

import collection.Empl;
import collection.MyNameComp;

public class UserDefinedSortingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Empl, String> tm = new TreeMap<Empl,String>(new MyNameComp());
		tm.put(new Empl("ram",2000), "ram inp");
		tm.put(new Empl("john",3000),"john inp");
		tm.put(new Empl("crish", 4000), "crish inp");
		System.out.println(tm);
		

	}

}
