package com.practice.interfaceexample.strategy;

/**
 * Created by dell on 1/30/2018.
 */

public class Duck {
    IFlyBehaviour iF;
    IQuackBehaviour iQ;

    public Duck(IFlyBehaviour iF, IQuackBehaviour iQ) {
        this.iF = iF;
        this.iQ = iQ;
    }

    public void setFly()
    {
      iF.fly();
    }

    public void setQuack()
    {
        iQ.quack();
    }
}
