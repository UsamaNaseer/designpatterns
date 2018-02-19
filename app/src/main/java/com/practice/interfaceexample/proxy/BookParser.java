package com.practice.interfaceexample.proxy;

/**
 * Created by dell on 2/8/2018.     Added proxy to not access the real subject directly so that it increses performance
 */

public class BookParser implements IBookParser {

    public BookParser(String book) {
    }

    @Override
    public int getnumberofPages() {
        return 2;
    }
}
