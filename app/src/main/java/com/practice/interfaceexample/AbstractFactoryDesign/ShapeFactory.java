package com.practice.interfaceexample.AbstractFactoryDesign;

/**
 * Created by dell on 2/6/2018.
 */

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String s) {
        if("Square".equalsIgnoreCase(s))
        {
            return new Square();
        }
        else if("Rectangle".equalsIgnoreCase(s))
        {
            return new Rectangle();
        }
        else return null;
    }

    @Override
    public Color getColor(String s) {
        return null;
    }
}
