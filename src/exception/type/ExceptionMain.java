package exception.type;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			File file = new File("file.txt");
			fr = new FileReader(file);
			char[] a = new char[50];
			fr.read(a);
			for (char c : a) {
				System.out.println(c);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			fr.close();
		}
	}

}
