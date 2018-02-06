package com.practice.interfaceexample.strategy;

import android.util.Log;

/**
 * Created by dell on 1/30/2018.
 */

public class SimpleQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        Log.e("Usama","Simple Quack");
    }
}
