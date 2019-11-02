package com.sda.patherns.creational.prototype;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, String color, int width, int height){
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    Shape cloneShape() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
