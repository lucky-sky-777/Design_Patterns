package baitap.behavioural_patterns.command;

public class SaveCommand implements Command {
	private Document document; // The Receiver

	public SaveCommand(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		document.save();
	}
}