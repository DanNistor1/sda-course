package com.sda.patherns.creational.prototype;

public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(int x, int y, String color, int radius){
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    Shape cloneShape() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
