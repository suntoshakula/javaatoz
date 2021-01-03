package hashtable;

import java.util.Hashtable;

public class SearchHash {
	 public static void main(String a[]){
	        Hashtable<String, String> hm = new Hashtable<String, String>();
	        //add key-value pair to Hashtable
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        if(hm.containsValue("SECOND INSERTED")){
	            System.out.println("The Hashtable contains value SECOND INSERTED");
	        } 
	 }
}
