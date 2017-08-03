package Impl;

import Interface.FlyBehavior;

/*
Created by ChrisChan on 2017/8/3.
*/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I 'm flying with wings");
    }
}
