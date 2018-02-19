package com.practice.interfaceexample.Facade;

import android.util.Log;

/**
 * Created by dell on 2/8/2018.    Simplify the complex instances so it makes a facade that user to interact with difficult instances through it
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        Log.e("Usama","Circle Draw");
    }
}
