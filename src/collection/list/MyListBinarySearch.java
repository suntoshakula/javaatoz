package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collection.Emp;
import collection.EmpComp;

public class MyListBinarySearch {

	public static void main(String a[]) {

		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(14, "Tom", 20000));
		empList.add(new Emp(12, "Dinesh", 50000));
		empList.add(new Emp(146, "Tom", 20000));
		empList.add(new Emp(201, "John", 40000));
		empList.add(new Emp(147, "Tome", 20000));
		Emp newEmp = new Emp(14, "Tom", 20000);
		System.out.println("list: " + empList);
		int index = Collections.binarySearch(empList, newEmp, new EmpComp());
		System.out.println("present or no " + index);

	}
}