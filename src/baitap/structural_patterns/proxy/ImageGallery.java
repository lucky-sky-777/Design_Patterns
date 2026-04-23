package baitap.structural_patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ImageGallery {
	public static void main(String[] args) {
		List<DisplayObject> galleryQueue = new ArrayList<>();

		// We load up our gallery with proxies.
		// This is instant, even if we added 10,000 images!
		galleryQueue.add(new ImageProxy("resources/vacation_photo_1.jpg"));
		galleryQueue.add(new ImageProxy("resources/vacation_photo_2.jpg"));
		galleryQueue.add(new ImageProxy("resources/vacation_photo_3.jpg"));

		System.out.println("--- App Opened: Gallery UI Loaded (No images in memory yet) ---\n");

		// User clicks on the first image
		System.out.println("User clicks on Photo 1:");
		galleryQueue.get(0).display(); // Triggers the load AND the display

		System.out.println("\nUser views Photo 1 again (e.g., zooming in):");
		galleryQueue.get(0).display(); // Skips the load, just displays!

		System.out.println("\nUser clicks on Photo 2:");
		galleryQueue.get(1).display(); // Triggers the load for Photo 2

		// Notice Photo 3 is NEVER loaded into memory because the user never clicked it!
	}
}