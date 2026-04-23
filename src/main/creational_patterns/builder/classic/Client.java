package main.creational_patterns.builder.classic;

import main.creational_patterns.builder.classic.builder.ShapeBuilder;
import main.creational_patterns.builder.classic.builder.sub_builder.Shape1Builder;
import main.creational_patterns.builder.classic.builder.sub_builder.Shape2Builder;

public class Client {

    public static void main(String[] args) {
        ShapeBuilder shapeBuilder;
        Director director;
        Shape shape;

        shapeBuilder = new Shape1Builder();
        director = new Director(shapeBuilder);
        director.build();
        shape = shapeBuilder.getResult();
        System.out.println(shape);

        shapeBuilder = new Shape2Builder();
        director = new Director(shapeBuilder);
        director.build();
        shape = shapeBuilder.getResult();
        System.out.println(shape);
    }

}
