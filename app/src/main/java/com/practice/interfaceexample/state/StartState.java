package com.practice.interfaceexample.state;

import android.util.Log;

/**
 * Created by dell on 2/26/2018.
 */

public class StartState implements State{
   Conteext conteext;

    public StartState(Conteext conteext) {
        this.conteext = conteext;
    }

    @Override
    public void action() {
Log.e("Usama","Start State");
this.conteext.changeState(new EndState(this.conteext));
this.conteext.action();

    }
}
