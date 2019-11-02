package com.sda.grasp.creator;

public class ShapeFactory {

    public Shape shape;

    public Shape createShape(String shapeName) {

        switch (shapeName) {
            case "circle":
                shape = new Circle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            case "square":
                shape = new Square();
                break;
        }
        return shape;
    }
}
