package main.creational_patterns.builder.classic.builder.sub_builder;

import main.creational_patterns.builder.classic.Shape;
import main.creational_patterns.builder.classic.builder.ShapeBuilder;
import main.creational_patterns.builder.classic.constant.Color;
import main.creational_patterns.builder.classic.constant.Type;

public class Shape1Builder implements ShapeBuilder {

    private Shape shape;

    public Shape1Builder() {
        this.shape = new Shape();
    }

    @Override
    public void buildColor() {
        shape.setColor(Color.BLACK);
    }

    @Override
    public void buildType() {
        shape.setType(Type.CIRCLE);
    }

    @Override
    public void buildSize() {
        shape.setSize(1);
    }

    @Override
    public void buildOpacity() {
        shape.setOpacity(0.5f);
    }

    @Override
    public Shape getResult() {
        return shape;
    }

}