package com.practice.interfaceexample.command;

/**
 * Created by dell on 2/7/2018.
 */

public class Invoker {
    ICommand On;
    ICommand Off;
    ICommand Up;
    ICommand Down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        On = on;
        Off = off;
        Up = up;
        Down = down;
    }
    public void ClickOn()
    {
        this.On.execute();
    }
    public void ClickOff()
    {
        this.Off.execute();
    }
    public void ClickUp()
    {
        this.Up.execute();
    }
    public void ClickDown()
    {
        this.Down.execute();
    }
    public void UndoClickOn()
    {
        this.On.unexecute();
    }
    public void UndoClickOff()
    {
        this.Off.unexecute();
    }
    public void UndoClickUp()
    {
        this.Up.unexecute();
    }
    public void UndoClickDown()
    {
        this.Down.unexecute();
    }

}
