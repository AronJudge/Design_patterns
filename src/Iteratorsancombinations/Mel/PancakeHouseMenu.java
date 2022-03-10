package Iteratorsancombinations.Mel;

import IteratorModel.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's panckage", "Packages with eggs,and toast", true,2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


    public Integer createIterator() {
        return ,menuItems.iterator();
    }
}
