package main.structural_patterns.facade;

public abstract class Shape {

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

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public float getOpacity() {
        return opacity;
    }

    protected abstract void draw();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getType()).append(" [");
        sb.append("color=").append(getColor()).append(", ");
        sb.append("size=").append(getSize()).append(", ");
        sb.append("opacity=").append(getOpacity()).append("]");
        return sb.toString();
    }

}