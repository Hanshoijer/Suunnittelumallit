package tehtava_22;

public class Button {

	private Command command;
	
	public Button(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}

}
