package main.structural_patterns.adapter;

import main.structural_patterns.adapter.constant.Color;
import main.structural_patterns.adapter.constant.Type;

public class Client {

    public static void main(String[] args) {
        AnotherShape anotherShape = new AnotherShape();

        ShapeAdapter shapeAdapter = new ShapeAdapter(anotherShape);

        shapeAdapter.draw(Color.BLACK, Type.CIRCLE, 1, 0.5f);
    }

}