package com.practice.interfaceexample.state;

/**
 * Created by dell on 2/26/2018.
 */

public class Conteext {
    State state;

    public Conteext() {
        this.state = new StartState(this);
    }



    public void action()
    {
        this.state.action();
    }



    public void changeState(State s)
    {
        this.state = s;
    }


}
