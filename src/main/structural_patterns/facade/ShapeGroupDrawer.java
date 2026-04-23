package main.structural_patterns.facade;

import main.structural_patterns.facade.constant.Color;

public class ShapeGroupDrawer {

    private Shape circle;
    private Shape square;

    public ShapeGroupDrawer() {
        circle = new Circle();
        square = new Square();
    }

    public void drawBlackSize1HalfOpacityCircle() {
        circle.setColor(Color.BLACK);
        circle.setSize(1);
        circle.setOpacity(0.5f);
        circle.draw();
        System.out.println(circle);
    }

    public void drawWhiteSize2FullOpacitySquare() {
        square.setColor(Color.WHITE);
        square.setSize(2);
        square.setOpacity(1.0f);
        square.draw();
    }

}