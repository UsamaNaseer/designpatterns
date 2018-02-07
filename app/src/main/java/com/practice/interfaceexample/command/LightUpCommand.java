package com.practice.interfaceexample.command;

/**
 * Created by dell on 2/7/2018.
 */

public class LightUpCommand implements ICommand  {
    Light light;
    public LightUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.Up();
    }

    @Override
    public void unexecute() {
        this.light.Down();
    }

}
