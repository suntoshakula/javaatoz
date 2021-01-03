package statix.ex;

public class StaticEx {
	public static void main(String[] args) {

		StaticStudent.setCllg("xyz");
		StaticStudent s1 = new StaticStudent("alice");
		StaticStudent s2 = new StaticStudent("bob");
		s1.getStudentInfo();
		s2.getStudentInfo();
	
	}
}
