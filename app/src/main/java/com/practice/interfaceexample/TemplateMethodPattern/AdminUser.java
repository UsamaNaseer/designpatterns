package com.practice.interfaceexample.TemplateMethodPattern;

import android.util.Log;

/**
 * Created by dell on 2/19/2018.
 */

public class AdminUser extends Record {


    @Override
    void validate() {
        Log.e("Usama","Admin User");
    }

}
