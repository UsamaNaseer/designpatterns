package com.practice.interfaceexample.Facade;

/**
 * Created by dell on 2/8/2018.
 */

public class ShapeFacade {
    Shape circle, rectangle, square;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }
    public void drawCircle()
    {
        circle.draw();
    }
    public void drawSquare()
    {
        square.draw();
    }
    public void drawRectangle()
    {
        rectangle.draw();
    }
}
