package hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class GetEntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hm = new Hashtable<String,String>();
		hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from Hashtable
        
        
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> entry:entires) {
        	System.out.println("key "+entry.getKey() + "value "+entry.getValue());
        }

	}

}
