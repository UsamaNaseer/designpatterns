package com.practice.interfaceexample.observer;

/**
 * Created by dell on 2/1/2018.
 */

public interface IObservable {
    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void notif();


}
