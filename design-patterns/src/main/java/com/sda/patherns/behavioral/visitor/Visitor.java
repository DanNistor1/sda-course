package com.sda.patherns.behavioral.visitor;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompound(Compound compound);
}
