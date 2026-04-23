package main.creational_patterns.prototype;

public abstract class Shape implements Cloneable {

    private String id;

    private String color;
    private String type;

    private int size;
    private float opacity;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}