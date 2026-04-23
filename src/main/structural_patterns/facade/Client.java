package main.structural_patterns.facade;

public class Client {

    public static void main(String[] args) {
        ShapeGroupDrawer shapeGroupDrawer = new ShapeGroupDrawer();
        shapeGroupDrawer.drawBlackSize1HalfOpacityCircle();
        System.out.println("\n");
        shapeGroupDrawer.drawWhiteSize2FullOpacitySquare();
    }

}