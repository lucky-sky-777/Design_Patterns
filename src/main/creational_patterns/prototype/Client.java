package main.creational_patterns.prototype;

public class Client {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("id1");
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("id2");
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("id1");
        System.out.println(clonedShape1 == clonedShape3);
    }

}