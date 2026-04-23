package baitap.behavioural_patterns.command;

public class PrintCommand implements Command {
	private Document document; // The Receiver

	public PrintCommand(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		document.print();
	}
}