package Impl;

import Interface.QuackBehavior;

/*
Created by ChrisChan on 2017/8/3.
*/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
