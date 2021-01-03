package collection.treeset;

import java.util.Set;
import java.util.TreeSet;

import collection.Emp;
import collection.EmpComp;

public class DuplicateEntries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Emp> ts = new TreeSet<Emp>(new EmpComp());
		ts.add(new Emp(201,"John",40000));
        ts.add(new Emp(302,"Krish",44500));
        ts.add(new Emp(146,"Tom",20000));
        ts.add(new Emp(543,"Abdul",10000));
        ts.add(new Emp(12,"Dinesh",50000));
        System.out.println(ts);
        ts.add(new Emp(146,"Tom",20000));
        System.out.println("treeset details"+ts);
        for(Emp e:ts){
            System.out.println(e);
        }

	}

}
