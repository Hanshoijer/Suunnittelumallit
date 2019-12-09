package tehtava_22;

public class ScreenDown implements Command{

	private Screen screen;
	
	public ScreenDown(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.screenDown();
	}

}
