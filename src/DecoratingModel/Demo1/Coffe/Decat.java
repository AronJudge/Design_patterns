package DecoratingModel.Demo1.Coffe;

public class Decat extends Beverage {

    public Decat () {
        description = "decat";
    }

    @Override
    public double cost() {
        return 1.23;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
