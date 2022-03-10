package DecoratingModel.Demo1.Decorator;

import DecoratingModel.Demo1.Coffe.Beverage;

public class BigSize extends SizeDecorator{


    Beverage beverage;

    public BigSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
