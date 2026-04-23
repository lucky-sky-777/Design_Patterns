package main.creational_patterns.builder.classic;

import main.creational_patterns.builder.classic.builder.ShapeBuilder;

public class Director {

    private ShapeBuilder shapeBuilder;

    public Director(ShapeBuilder shapeBuilder) {
        this.shapeBuilder = shapeBuilder;
    }

    public void build() {
        shapeBuilder.buildColor();
        shapeBuilder.buildType();
        shapeBuilder.buildSize();
        shapeBuilder.buildOpacity();
    }

}