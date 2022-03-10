package StrategyMode.Duck;

import StrategyMode.behavier.Quack;
import StrategyMode.behavier.QuackBehavior;

public class SimUDuck {
    QuackBehavior quackBehavior = new Quack();
    public void performQuack() {
        quackBehavior.quack();
    }
}
