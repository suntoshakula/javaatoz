package polymorphism.dynamic.type;

public abstract class Employee {
	
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		System.out.println("constructing an employee");
		this.name = name;
		this.address = address;
		this.number = number;
		
				
	}

}
