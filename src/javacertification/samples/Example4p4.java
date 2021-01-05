package javacertification.samples;

import static javacertification.samples.State.*;
import static java.lang.System.out;
public class Example4p4 {
	
	public static void main(String[] args) {
		State[] states = {IDLE, BUSY, IDLE, BLOCKED};
		
		for(State s: states)
			out.print(s+" ");
		}
	}

