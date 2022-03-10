package DecoratingModel.Demo1.Decorator;

import DecoratingModel.Demo1.Coffe.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription() ;
    public abstract int getSize();
}
