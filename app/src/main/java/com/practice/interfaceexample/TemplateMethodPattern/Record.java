package com.practice.interfaceexample.TemplateMethodPattern;

import android.util.Log;

/**
 * Created by dell on 2/19/2018.
 */

public abstract class Record {

    public void save()
    {
        this.validate();
        this.beforesave();
        //

    }
    abstract void validate();


    public void beforesave()
    {
        Log.e("Usama","Record Save");
    }


}
