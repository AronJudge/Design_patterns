package FactoryModel.Demo2.Pizza;

import FactoryModel.Demo2.Pizza.Pizza;

public class LAStyleCheesePizza extends Pizza {
    public LAStyleCheesePizza() {
        name = "LA Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void prepare() {

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
