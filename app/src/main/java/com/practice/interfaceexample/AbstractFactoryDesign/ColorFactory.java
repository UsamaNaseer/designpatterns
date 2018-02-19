package com.practice.interfaceexample.AbstractFactoryDesign;

import com.practice.interfaceexample.FactoryDesign.Animal;
import com.practice.interfaceexample.FactoryDesign.Cat;
import com.practice.interfaceexample.FactoryDesign.Dog;

/**
 * Created by dell on 2/6/2018.
 */

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String s) {
        return null;
    }

    @Override
    public Color getColor(String s) {

            if("Red".equalsIgnoreCase(s))
            {
                return new Red();
            }
            else if("Blue".equalsIgnoreCase(s))
            {
                return new Blue();
            }
            else return null;

    }
}
