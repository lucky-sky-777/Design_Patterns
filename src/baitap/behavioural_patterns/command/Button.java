package baitap.behavioural_patterns.command;

public class Button {
	private Command command;

	// We inject the specific command when creating the button
	public Button(Command command) {
		this.command = command;
	}

	// The user clicks the button, and the invoker triggers the command
	public void click() {
		System.out.println("Front-End: Button was clicked.");
		command.execute();
	}
}