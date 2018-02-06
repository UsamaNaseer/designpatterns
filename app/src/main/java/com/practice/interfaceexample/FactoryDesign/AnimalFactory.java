package com.practice.interfaceexample.FactoryDesign;

/**
 * Created by dell on 2/6/2018.
 */

public class AnimalFactory {
    public Animal getAnimal(String s)
    {
        if("Dog".equalsIgnoreCase(s))
        {
            return new Dog();
        }
        else if("Cat".equalsIgnoreCase(s))
        {
            return new Cat();
        }
        else return null;
    }
}
