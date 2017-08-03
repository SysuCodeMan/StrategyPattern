package Bean;

import Interface.FlyBehavior;
import Interface.QuackBehavior;

/*
Created by ChrisChan on 2017/8/3.
*/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){};
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
