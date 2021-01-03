package clonnable;

public class DogName implements Cloneable {

	private String dname;

	public DogName() {
		// TODO Auto-generated constructor stub
	}

	public DogName(String dname) {
		this.dname = dname;
	}

	public String getName() {
		return dname;
	}
	
	public void setDname(String dname) {
	      this.dname = dname;
	   }

	// Overriding clone() method of Object class
	public Object clone() throws CloneNotSupportedException {
		return (DogName) super.clone();
	}

}