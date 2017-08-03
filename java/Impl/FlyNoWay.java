package Impl;

import Interface.FlyBehavior;

/*
Created by ChrisChan on 2017/8/3.
*/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
