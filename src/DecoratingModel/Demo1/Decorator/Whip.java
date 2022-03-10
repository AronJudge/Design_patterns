package DecoratingModel.Demo1.Decorator;


import DecoratingModel.Demo1.Coffe.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2.5 + beverage.cost();
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }
}
