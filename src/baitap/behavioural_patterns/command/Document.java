package baitap.behavioural_patterns.command;

public class Document {
	public void save() {
		System.out.println("Back-End: Saving the document to disk...");
	}

	public void print() {
		System.out.println("Back-End: Sending the document to the printer...");
	}
}