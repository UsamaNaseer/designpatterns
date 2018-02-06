package com.practice.interfaceexample.builder;

/**
 * Created by dell on 1/25/2018.
 */

public class PhoneBuilder {
    int ram;
    String model;
    int size;
    int battery;
    String os;


    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(ram,model,size,battery,os);
    }



}
