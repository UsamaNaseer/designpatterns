package com.practice.interfaceexample.decorator;

/**
 * Created by dell on 2/6/2018.
 */

public class Caramel extends AddOnDecorator {
    Beverages b;
    public Caramel(Beverages beverages) {
    b = beverages;
    }

    @Override
    public int cost() {
        return this.b.cost() + 1;
    }
}
