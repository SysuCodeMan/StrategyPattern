package Test;

import Bean.Duck;
import Bean.MallardDuck;

/*
Created by ChrisChan on 2017/8/3.
*/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
