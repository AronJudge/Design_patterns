package TemplateMethod.Hook;

public class BeverageTestDrive {

    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n Making coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
