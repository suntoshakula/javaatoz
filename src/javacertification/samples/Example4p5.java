package javacertification.samples;
import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Example4p5 {
	public static void main(String[] args) throws FileNotFoundException {
		out.println("main println");
		PrintWriter pw = new PrintWriter("log.txt");
		writeInfo(pw);
		pw.flush();
		pw.close();
	}

	private static void writeInfo(PrintWriter pw) {
		// TODO Auto-generated method stub
		out.println("writeinfo println");
		System.out.println("calling println");
		
	}

}
