package FactoryModel.Demo2.LA;

import FactoryModel.Demo2.Pizza.LAStyleCheesePizza;
import FactoryModel.Demo2.Pizza.LAStylePepperoniPizza;
import FactoryModel.Demo2.Pizza.LAStyleVeggiePizza;
import FactoryModel.Demo2.PizzaStore;
import FactoryModel.Demo2.Pizza.Pizza;

public class LAPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new LAStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new LAStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new LAStylePepperoniPizza();
        } else return null;
    }
}
