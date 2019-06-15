package com.akon.compose;

public class DinerMenuIterator implements Iterrator<MenuItem> {

    MenuItem [] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if(position > menuItems.length || menuItems[position] == null){
            return false;
        }
        return true;
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
