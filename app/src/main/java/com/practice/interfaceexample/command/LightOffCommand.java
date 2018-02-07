package com.practice.interfaceexample.command;

/**
 * Created by dell on 2/7/2018.
 */

public class LightOffCommand implements ICommand {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.Off();
    }

    @Override
    public void unexecute() {
        this.light.On();
    }
}
