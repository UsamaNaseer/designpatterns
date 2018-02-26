package com.practice.interfaceexample.state;

import android.util.Log;

/**
 * Created by dell on 2/26/2018.
 */

public class EndState implements State {
    Conteext conteext;

    public EndState(Conteext conteext) {
        this.conteext = conteext;
    }

    @Override
    public void action() {
        Log.e("Usama","End State");
        this.conteext.changeState(new StartState(this.conteext));


    }
}
