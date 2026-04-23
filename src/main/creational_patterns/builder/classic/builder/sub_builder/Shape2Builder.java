package main.creational_patterns.builder.classic.builder.sub_builder;

import main.creational_patterns.builder.classic.Shape;
import main.creational_patterns.builder.classic.builder.ShapeBuilder;
import main.creational_patterns.builder.classic.constant.Color;
import main.creational_patterns.builder.classic.constant.Type;

public class Shape2Builder implements ShapeBuilder {

    private Shape shape;

    public Shape2Builder() {
        this.shape = new Shape();
    }

    @Override
    public void buildColor() {
        shape.setColor(Color.WHITE);
    }

    @Override
    public void buildType() {
        shape.setType(Type.SQUARE);
    }

    @Override
    public void buildSize() {
        shape.setSize(2);
    }

    @Override
    public void buildOpacity() {
        shape.setOpacity(0.7f);
    }

    @Override
    public Shape getResult() {
        return shape;
    }

}