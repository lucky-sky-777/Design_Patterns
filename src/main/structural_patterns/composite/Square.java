package main.structural_patterns.composite;

public class Square implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " Square");
    }

}