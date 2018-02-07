package com.practice.interfaceexample.command;

/**
 * Created by dell on 2/7/2018.
 */

public class LightOnCommand implements ICommand {
Light light;
    public LightOnCommand(Light light) {
    this.light = light;
    }

    @Override
    public void execute() {
        this.light.On();
    }

    @Override
    public void unexecute() {
        this.light.Off();
    }
}
