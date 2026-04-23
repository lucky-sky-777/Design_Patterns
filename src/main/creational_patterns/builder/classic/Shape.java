package main.creational_patterns.builder.classic;

public class Shape {

    private String color;
    private String type;

    private int size;
    private float opacity;

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("color='").append(color).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", size=").append(size);
        sb.append(", opacity=").append(opacity);
        sb.append('}');
        return sb.toString();
    }

}