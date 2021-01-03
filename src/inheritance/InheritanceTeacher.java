package inheritance;

public class InheritanceTeacher {
	
	private String designation = "Teacher";
	private String collegeName = "beginnerbook";
	
	public InheritanceTeacher() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of Parent");
	}
	
	public InheritanceTeacher(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of Parent -int parameter " +a);
	}
	
	//overriding feature
	void disp(){
		System.out.println("Parent Method");
	   }
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	void does() {
		System.out.println("teaching");
	}

}
