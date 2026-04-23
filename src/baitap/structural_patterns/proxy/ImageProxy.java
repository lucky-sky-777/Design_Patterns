package baitap.structural_patterns.proxy;

public class ImageProxy implements DisplayObject {
	private String filePath;
	private ImageFile realImageFile; // Null until we actually need it

	public ImageProxy(String filePath) {
		this.filePath = filePath;
		// Notice: We do NOT load the image from disk here!
		// This makes creating a proxy extremely fast and cheap.
	}

	@Override
	public void display() {
		// Lazy Initialization: Only create the real object if it doesn't exist yet
		if (realImageFile == null) {
			realImageFile = new ImageFile(filePath);
		}

		// Delegate the actual display work to the real image
		realImageFile.display();
	}
}