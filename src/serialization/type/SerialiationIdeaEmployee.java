package serialization.type;

import java.io.Serializable;

public class SerialiationIdeaEmployee  implements Serializable{
	
	public String name;
	public String address;
	public transient int ssn;
	public int number;
	
	public void mailCheck() {
		System.out.println("mailing a check to "+name + " "+ address);
	}
	
		

}
