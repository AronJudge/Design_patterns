package FactoryModel.SmpleDemo;

public class SimplePizzaFactory {
    Pizza pizza = null;
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
