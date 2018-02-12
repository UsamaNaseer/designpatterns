package com.practice.interfaceexample.bridge;

/**
 * Created by dell on 2/12/2018.  Is m abstraction aur uski implementation independent hti ek dusre s
 */

public class Circle extends Shape {

int radius;
    public Circle(int radius, com.practice.interfaceexample.bridge.drawApi drawApi) {
        super(drawApi);
    this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.draw(radius);
    }
}
