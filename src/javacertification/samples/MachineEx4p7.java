package javacertification.samples;

public class MachineEx4p7 {
	
	public static class StateConstant{
		public static final String BUSY="Busy";
		public static final String IDLE="idle";
	}
	
	public enum MachineState4p7{
		BUSY, IDLE, BLOCKED
	}
	public enum AuxMachineState{
		UNDER_REPAIR, WRITE_OFF, HIRED, AVAILABLE
	}

}
