package collection.list;

import java.util.Collections;
import java.util.List;
import collection.Emp;

public class MultipleCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp = "java multiple copies";
		List<String> copies = Collections.nCopies(5, temp);
		System.out.println(copies);
		
		Emp emp = new Emp(10, "Raghu", 25000);
		List<Emp> empcopies = Collections.nCopies(5, emp);
		System.out.println(empcopies);
		
	}

}
