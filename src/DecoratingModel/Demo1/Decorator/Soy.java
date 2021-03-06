package DecoratingModel.Demo1.Decorator;

import DecoratingModel.Demo1.Coffe.Beverage;

public class Soy extends CondimentDecorator{

    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += 0.10;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .15;
        } else if (getSize() == Beverage.VENTI) {
            cost += .20;
        }
        return cost;
    }

    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
