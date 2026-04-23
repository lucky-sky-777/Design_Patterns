package baitap.structural_patterns.proxy;

public class ImageFile implements DisplayObject {
	private String filePath;

	public ImageFile(String filePath) {
		this.filePath = filePath;
		loadFromDisk(); // The expensive operation happens immediately!
	}

	private void loadFromDisk() {
		System.out.println(" -> [HEAVY OPERATION] Loading " + filePath + " from disk into memory...");
		// Pretend there is a Thread.sleep() or actual I/O operations here
	}

	@Override
	public void display() {
		System.out.println("Rendering: " + filePath + " on screen.");
	}
}