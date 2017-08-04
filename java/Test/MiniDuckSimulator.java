package Test;

import Bean.Duck;
import Bean.MallardDuck;
import Bean.ModelDuck;
import Impl.FlyRocketPowered;
import Impl.FlyWithWings;
import Impl.Quack;
import Interface.FlyBehavior;
import Interface.QuackBehavior;

/*
Created by ChrisChan on 2017/8/3.
*/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
