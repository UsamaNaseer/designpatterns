package com.practice.interfaceexample.callbacks;

/**
 * Created by dell on 3/8/2018.
 */

public interface ICall {
    interface ICallback<T>
    {
        void call();
    }

    interface Add
    {
        void add(ICallback<String> s,Icallbackk1 no);
    }



}
