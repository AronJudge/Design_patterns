package TemplateMethod.Hook;

public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }

    public void pourInCup() {
        System.out.println("Pouring into cup!");
    }

    abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }
}
