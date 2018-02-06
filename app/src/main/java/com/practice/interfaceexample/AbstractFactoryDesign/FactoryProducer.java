package com.practice.interfaceexample.AbstractFactoryDesign;

/**
 * Created by dell on 2/6/2018.
 */

public class FactoryProducer {
    public AbstractFactory getFactory(String s)
    {
        if("Shape".equalsIgnoreCase(s))
        {
            return new ShapeFactory();
        }
        else if("Color".equalsIgnoreCase(s))
        {
            return new ColorFactory();
        }
        else return null;
    }
}
