package com.practice.interfaceexample.bridge;

/**
 * Created by dell on 2/12/2018.
 */

public abstract class Shape {
    protected drawApi drawApi;

    protected Shape(com.practice.interfaceexample.bridge.drawApi drawApi) {
        this.drawApi = drawApi;
    }

   public abstract void draw();
}
