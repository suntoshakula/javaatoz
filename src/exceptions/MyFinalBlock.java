package exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFinalBlock {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.google.com");
			
		}finally {
			System.out.println("in finally url malformed block");
		}
		
		try {
			int i =10/0;
			
		}catch(Exception e) {
			System.out.println("inside 1st catch");
			
		}finally {
			System.out.println("inside 1st finally block");
		}
		
		try {
			int i =10/10;
			
		}catch(Exception ex) {
			
			System.out.println("Inside 2nd catch Block");
        } finally {
            System.out.println("Inside 2nd finally block");
        }

	}

}
