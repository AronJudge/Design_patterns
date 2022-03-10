package SingletonModel;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    // private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
    private volatile static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        // The time and space of the boiler at the beginning of the code
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void brain() {
        if (!isEmpty() && isBoiled()) {
            // push boiled milk chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // boiled
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
