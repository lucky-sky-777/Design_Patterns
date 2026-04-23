package main.creational_patterns.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapes = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape cache = shapes.get(id);

        return (Shape) cache.clone();
    }

    public static void loadCache() {
        Circle circle1 = new Circle();
        circle1.setId("id1");
        shapes.put(circle1.getId(), circle1);

        Square square = new Square();
        square.setId("id2");
        shapes.put(square.getId(), square);
    }

}