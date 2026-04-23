package main.structural_patterns.bridge;

import main.structural_patterns.bridge.constant.Color;

public class WhiteColor implements ShapeColor {

    @Override
    public String getColor() {
        return Color.WHITE;
    }

}