package FactoryModel.Demo2.NY;

import FactoryModel.Demo2.Pizza.NYStyleCheesePizza;
import FactoryModel.Demo2.Pizza.NYStylePepperoniPizza;
import FactoryModel.Demo2.Pizza.NYStyleVeggiePizza;
import FactoryModel.Demo2.PizzaStore;
import FactoryModel.Demo2.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
