package DecoratingModel.Demo1.Coffe;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.98;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
