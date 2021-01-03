package hashtable;

import java.util.Hashtable;
import java.util.Set;

public class IterateHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> hashT = new Hashtable<String,String>();
		hashT.put("first","myfirst");
		hashT.put("second", "mysecond");
		Set<String> keys = hashT.keySet();
		for(String key: keys) {
			System.out.println("value for corresponding key "+hashT.get(key));
		}
		

	}

}
