package statix.ex;

public class StaticStudent {
	
	String name;
	int rollno;
	static String clgname;
	static int counter=0;
	
	public StaticStudent(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollno = setRollNo();
	}
	static int setRollNo() {
		counter++;
		return counter;
	}
	static void setCllg(String name) {
		clgname = name;
	}
	
	void getStudentInfo() {
		System.out.println("name "+this.name);
		System.out.println("rollno "+this.rollno);
		System.out.println("cllgname "+clgname);
	}
	

}
