package tehtava_22;

public class ScreenUp implements Command{

	private Screen screen;
	
	public ScreenUp(Screen screen) {
		this.screen = screen;
	}
	@Override
	public void execute() {
		screen.screenUp();
	}

}
