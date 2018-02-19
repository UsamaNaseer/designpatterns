package com.practice.interfaceexample.composite;

/**
 * Created by dell on 2/19/2018.
 */

public class Todo implements TodoList {
    String text;

    public Todo(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        return this.text;
    }
}
