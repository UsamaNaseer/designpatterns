package com.practice.interfaceexample.command;

/**
 * Created by dell on 2/7/2018.
 */

public class LightDownCommand  implements ICommand  {
    Light light;
    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.Down();
    }

    @Override
    public void unexecute() {
        this.light.Up();
    }

}