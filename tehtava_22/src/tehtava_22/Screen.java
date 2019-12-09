package tehtava_22;

public class Screen {

	private boolean screenIsUp = false;
	
	public void screenUp() {
		screenIsUp = true;
		System.out.println("Screen is up");
	}
	
	public void screenDown() {
		screenIsUp = false;
		System.out.println("Screen is down");
	}
}
