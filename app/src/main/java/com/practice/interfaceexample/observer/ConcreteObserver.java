package com.practice.interfaceexample.observer;

import android.util.Log;

/**
 * Created by dell on 2/1/2018.
 */

public class ConcreteObserver implements IObserver {
    ConcreteObservable concreteObservable;
    public ConcreteObserver(ConcreteObservable concreteObservable) {
    this.concreteObservable = concreteObservable;
    }
int temp;
    @Override
    public void update() {
        this.temp = concreteObservable.getTemperature();
    }
    public void display()
    {
        Log.e("Usama","" +temp);
    }
}
