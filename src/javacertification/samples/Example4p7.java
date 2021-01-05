package javacertification.samples;

import static javacertification.samples.MachineEx4p7.StateConstant.*;

import javacertification.samples.MachineEx4p7.AuxMachineState;
import static javacertification.samples.MachineEx4p7.AuxMachineState.*;
import static javacertification.samples.MachineEx4p7.AuxMachineState.WRITE_OFF;

import static javacertification.samples.MachineEx4p7.StateConstant;
import static javacertification.samples.MachineEx4p7.MachineState4p7.*;

import javacertification.samples.MachineEx4p7.MachineState4p7;

public class Example4p7 {
	
	public static void main(String[] args) {
		StateConstant sc = new StateConstant();
		//String s1 = IDLE;
		String s2 = StateConstant.IDLE;
		
		AuxMachineState[] states = {
				AVAILABLE, HIRED, UNDER_REPAIR,
				WRITE_OFF,
				AuxMachineState.WRITE_OFF,
				MachineEx4p7.AuxMachineState.WRITE_OFF
		};
		
		for(AuxMachineState s: states) {
			System.out.println(s+" ");
		}
	}

}
