package com.sda.grasp.creator;

public class DemoCreator {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.createShape("circle").show();
        shapeFactory.createShape("rectangle").show();
        shapeFactory.createShape("square").show();
    }
}
