package StrategyMode;

import StrategyMode.Duck.Duck;
import StrategyMode.Duck.MallardDuck;
import StrategyMode.Duck.ModelDuck;
import StrategyMode.behavier.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
