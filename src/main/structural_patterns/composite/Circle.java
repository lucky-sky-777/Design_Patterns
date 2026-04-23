package main.structural_patterns.composite;

public class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " Circle");
    }

}