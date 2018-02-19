package com.practice.interfaceexample.TemplateMethodPattern;

import android.util.Log;

/**
 * Created by dell on 2/19/2018.
 */

public class NormalUser extends Record {


    @Override
    void validate() {
        Log.e("Usama","Normal User");
    }


    @Override
    public void beforesave() {
        Log.e("Usama","Normal Save");
    }


}
