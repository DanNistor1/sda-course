package com.sda.patherns.creational.prototype;

public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    abstract Shape cloneShape();
}
