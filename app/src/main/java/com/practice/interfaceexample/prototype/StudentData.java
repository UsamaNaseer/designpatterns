package com.practice.interfaceexample.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2/28/2018.
 */

public class StudentData implements Cloneable {
    List<String> data;

    public StudentData(List<String> data) {
        this.data = data;
    }

    public StudentData() {
        this.data = new ArrayList<>();
    }

    public void loaddata()
    {
        this.data.add("Usama");
        this.data.add("Sunny");
        this.data.add("Maxy");
        this.data.add("Osama");
        this.data.add("Owais");
    }

    public List<String> getData() {
        return data;
    }

    public Object Clone() throws CloneNotSupportedException
    {
        List<String> dataa = new ArrayList<>();
        for(String s : this.getData())
        {
            dataa.add(s);
        }
        return new StudentData(dataa);
    }
}
