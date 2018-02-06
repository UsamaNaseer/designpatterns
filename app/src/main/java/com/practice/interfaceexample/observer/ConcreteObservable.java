package com.practice.interfaceexample.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2/1/2018.
 */

public class ConcreteObservable implements IObservable {
    List<IObserver> observers = new ArrayList<IObserver>();
   public int temp = 20;
    @Override
    public void add(IObserver iObserver) {
        observers.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        observers.remove(iObserver);
    }

    @Override
    public void notif() {
        for(IObserver observer : observers)
        {
            observer.update();
        }
    }

    public int getTemperature()
    {
        return this.temp;
    }
}
