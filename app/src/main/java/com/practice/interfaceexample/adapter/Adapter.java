package com.practice.interfaceexample.adapter;

/**
 * Created by dell on 2/7/2018.
 */

public class Adapter implements ITarget {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificrequest();
    }
}
