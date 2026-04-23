package main.creational_patterns.builder.modern;

import main.creational_patterns.builder.modern.constant.Color;
import main.creational_patterns.builder.modern.constant.Type;

public class Client {

    public static void main(String[] args) {
        Shape shape;

        shape = new Shape.Builder(Color.BLACK, Type.CIRCLE)
                .setSize(1)
                .setOpacity(0.5f)
                .build();
        System.out.println(shape);

        shape = new Shape.Builder(Color.WHITE, Type.SQUARE)
                .setSize(2)
                .setOpacity(0.7f)
                .build();
        System.out.println(shape);
    }

}