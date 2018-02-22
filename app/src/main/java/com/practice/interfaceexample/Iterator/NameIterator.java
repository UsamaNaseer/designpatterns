package com.practice.interfaceexample.Iterator;

import android.content.Context;

/**
 * Created by dell on 2/22/2018.
 */

public class NameIterator implements Iterator {
String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
int index;
    @Override
    public boolean hasNext() {
        if(index<names.length) return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()) return names[index++];
        return null;
    }
}
