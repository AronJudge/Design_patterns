package StrategyMode.behavier;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("StrategyMode.behavier.Quack");
    }
}
