package serialization.type;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizaeDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		SerialiationIdeaEmployee e = new SerialiationIdeaEmployee();
		e.name = "santosh";
		e.address = "montreal";
		e.ssn = 112;
		e.number = 101;

		try {

			FileOutputStream fileout = new FileOutputStream("stream.txt");
			FileInputStream filein = new FileInputStream("stream.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			ObjectInputStream in = new ObjectInputStream(filein);
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("serilazed");

			SerialiationIdeaEmployee ee = (SerialiationIdeaEmployee) in.readObject();
			in.close();
			filein.close();
			System.out.println("name "+ee.name);
			System.out.println("name "+ee.address);
			System.out.println("name "+ee.ssn);
			System.out.println("name "+ee.number);
			System.out.println(ee.name.compareTo("santosah"));
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
