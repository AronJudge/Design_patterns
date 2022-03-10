package StrategyMode.Duck;

import StrategyMode.behavier.FlyWithWings;
import StrategyMode.behavier.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
