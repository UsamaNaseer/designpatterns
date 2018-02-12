package com.practice.interfaceexample.proxy;

/**
 * Created by dell on 2/8/2018.
 */

public class BookParser implements IBookParser {

    public BookParser(String book) {
    }

    @Override
    public int getnumberofPages() {
        return 2;
    }
}
