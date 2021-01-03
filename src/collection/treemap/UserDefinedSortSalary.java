package collection.treemap;

import java.util.TreeMap;

import collection.Empl;
import collection.MySalaryComp;

public class UserDefinedSortSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Empl, String> tm = new TreeMap<Empl,String>(new MySalaryComp());
		tm.put(new Empl("ram",2000), "ram");
		tm.put(new Empl("soak",1), "soak");
		tm.put(new Empl("team",3200), "kg");
		System.out.println(tm);

	}

}
