package SuperEx;

public class Emp extends Person{
	float salary;
	public Emp(int id, String name, float salary) {
		// TODO Auto-generated constructor stub
		super(id,name);
		this.salary = salary;		
	}
	void display() {
		System.out.println(id + " "+ name+" "+salary);
	}

}
