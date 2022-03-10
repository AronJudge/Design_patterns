package DecoratingModel.Demo1.Coffe;

public abstract class Beverage {

    protected static final int TALL = 1;
    protected static final int GRANDE = 2;
    protected static final int VENTI = 3;
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract int getSize();
}
