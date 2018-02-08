package com.practice.interfaceexample.proxy;

/**
 * Created by dell on 2/8/2018.
 */

public class LazyBookParserProxy implements IBookParser {
 private BookParser parser = null;
 private String book = null;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getnumberofPages() {
        if(this.parser==null) this.parser = new BookParser(this.book);
        return this.parser.getnumberofPages();
    }
}
