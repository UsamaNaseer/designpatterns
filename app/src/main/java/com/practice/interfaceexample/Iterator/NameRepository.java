package com.practice.interfaceexample.Iterator;

/**
 * Created by dell on 2/22/2018.
 */

public class NameRepository implements Container {
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
