package FactoryModel.Demo2.Pizza;

import FactoryModel.Demo2.Ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

    }

  /*  @Override
    void prepare() {
        System.out.println("Preparing " + name);
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }*/
}
