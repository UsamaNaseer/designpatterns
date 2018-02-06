package com.practice.interfaceexample.builder;

/**
 * Created by dell on 1/25/2018.
 */

public class Phone {
    int ram;
    String model;
    int size;
    int battery;
    String os;

    public Phone(int ram, String model, int size, int battery, String os) {
        this.ram = ram;
        this.model = model;
        this.size = size;
        this.battery = battery;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", battery=" + battery +
                ", os='" + os + '\'' +
                '}';
    }
}
