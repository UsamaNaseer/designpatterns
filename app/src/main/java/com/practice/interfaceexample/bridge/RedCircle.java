package com.practice.interfaceexample.bridge;

import android.util.Log;

/**
 * Created by dell on 2/12/2018.
 */

public class RedCircle implements drawApi {
    @Override
    public void draw(int radius) {
        Log.e("Usama","Red Circle with Radius " +radius);
    }
}
