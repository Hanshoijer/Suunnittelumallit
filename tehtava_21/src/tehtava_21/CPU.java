package tehtava_21;

public class CPU {

	public void freeze() {
		System.out.println("CPU Freeze");
	}
	
	public void jump(long position) {
		System.out.println("CPU Jump position: " + position);
	}
	
	public void execute() {
		System.out.println("CPU Executing");
	}
	
}
