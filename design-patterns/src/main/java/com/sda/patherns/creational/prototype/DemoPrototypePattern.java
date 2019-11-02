package com.sda.patherns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class DemoPrototypePattern {

    public static void main(String[] args) {

        Shape circle = new Circle(2,2,"rosu",10);
        Shape circleClone = circle.cloneShape();
        Shape rectangle = new Rectangle(1,1,"albastru",5,7);
        Shape rectangleClone = rectangle.cloneShape();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(circleClone);
        shapeList.add(rectangle);
        shapeList.add(rectangleClone);

        shapeList.forEach(shape -> System.out.println(shape));

    }
}
