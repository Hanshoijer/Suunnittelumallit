package tehtava_22;

public class Main {

	public static void main(String[] args) {

		Screen screen = new Screen();
		Button buttonUp = new Button(new ScreenUp(screen));
		Button buttonDown = new Button(new ScreenDown(screen));
		
		buttonUp.pressButton();
		buttonDown.pressButton();
		buttonUp.pressButton();
		buttonDown.pressButton();
		buttonUp.pressButton();
		buttonDown.pressButton();
	}

}
