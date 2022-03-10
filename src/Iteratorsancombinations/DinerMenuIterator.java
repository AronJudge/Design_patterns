package Iteratorsancombinations;

public class DinerMenuIterator implements Iterator{
    Iteratorsancombinations.MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(Iteratorsancombinations.MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

}
