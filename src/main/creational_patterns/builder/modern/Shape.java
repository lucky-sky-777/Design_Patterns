package main.creational_patterns.builder.modern;

public class Shape {

    private String color;
    private String type;

    private int size;
    private float opacity;

    private Shape(Builder builder) {
        this.color = builder.color;
        this.type = builder.type;
        this.size = builder.size;
        this.opacity = builder.opacity;;
    }

    public static class Builder {

        private final String color;
        private final String type;

        private int size = 1;
        private float opacity = 1;

        public Builder(String color, String type) {
            this.color = color;
            this.type = type;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setOpacity(float opacity) {
            this.opacity = opacity;
            return this;
        }

        public Shape build() {
            return new Shape(this);
        }

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