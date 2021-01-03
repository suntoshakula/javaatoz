package javacertification.samples;

enum MachineState{
	BUSY,
	IDLE,
	BLOCKED
}

 class Machine{
	 
	 private MachineState state;
	 public MachineState getState() {
		 return this.state;
	 }
	 public void setState(MachineState state) {
		 this.state = state;
	 }
	
}

public class Example3p4 {
	
	public static void main(String[] args) {
		Machine m = new Machine();
		m.setState(MachineState.IDLE);
		System.out.println("machine state: "+m.getState());
	}

}
