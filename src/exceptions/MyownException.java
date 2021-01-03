package exceptions;

public class MyownException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			MyownException.myTest(null);
			
		}catch(MyAppException e) {
			System.out.println(e.getMessage());
			
		}
		

	}
	
	static void myTest(String str) throws MyAppException{
		if(str == null) {
			throw new MyAppException("string val is null");
		}
		
	}

}
