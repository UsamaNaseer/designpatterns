package com.practice.interfaceexample.strategy;

import android.util.Log;

/**
 * Created by dell on 1/30/2018.
 */

public class NoQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        Log.e("Usama","No Quack");
    }
}
