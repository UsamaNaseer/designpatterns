package com.practice.interfaceexample.callbacks;

/**
 * Created by dell on 3/8/2018.
 */

public class CallImp implements ICall.Add {

    @Override
    public void add(ICall.ICallback<String> s, Icallbackk1 no) {
s.call();
no.nocall();
    }
}
