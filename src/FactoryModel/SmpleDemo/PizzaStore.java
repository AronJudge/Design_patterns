package FactoryModel.SmpleDemo;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.perpare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
