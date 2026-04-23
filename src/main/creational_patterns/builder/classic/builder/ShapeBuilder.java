package main.creational_patterns.builder.classic.builder;

import main.creational_patterns.builder.classic.Shape;

public interface ShapeBuilder {

    void buildColor();
    void buildType();
    void buildSize();
    void buildOpacity();

    Shape getResult();

}