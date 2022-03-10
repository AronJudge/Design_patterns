package FactoryModel.Demo2.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
/*    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;*/

    public abstract void prepare();

    public ArrayList toppings = new ArrayList();
    
  /*  public void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }*/

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getName() {
        return name;
    }

    public String toString() {
        System.out.println(name);
        return null;
    }


}
