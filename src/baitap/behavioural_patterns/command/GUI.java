package baitap.behavioural_patterns.command;

public class GUI {
	public static void main(String[] args) {
		// 1. Create the Receiver (The actual document)
		Document myDocument = new Document();

		// 2. Create the Commands, passing in the Receiver
		Command saveCommand = new SaveCommand(myDocument);
		Command printCommand = new PrintCommand(myDocument);

		// 3. Create the Invokers (The UI elements), passing in the Commands
		Button saveButton = new Button(saveCommand);
		Button printButton = new Button(printCommand);

		// 4. Simulate user interaction
		System.out.println("--- Simulating UI Interaction ---");
		saveButton.click();

		System.out.println();

		printButton.click();
	}
}