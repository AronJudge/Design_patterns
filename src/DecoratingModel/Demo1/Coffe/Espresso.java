package DecoratingModel.Demo1.Coffe;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
