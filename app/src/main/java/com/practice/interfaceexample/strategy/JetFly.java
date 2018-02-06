package com.practice.interfaceexample.strategy;

import android.util.Log;

/**
 * Created by dell on 1/30/2018.
 */

public class JetFly implements IFlyBehaviour {
    @Override
    public void fly() {
        Log.e("Usama","Jet Fly");
    }
}
