package FactoryModel.Demo2;

import FactoryModel.Demo2.LA.LAPizzaStore;
import FactoryModel.Demo2.NY.NYPizzaStore;
import FactoryModel.Demo2.Pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore laStore = new LAPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = laStore.orderPizza("Cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
