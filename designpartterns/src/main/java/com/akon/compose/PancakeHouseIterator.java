package com.akon.compose;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterrator<MenuItem> {

    private ArrayList<MenuItem> menuItems;
    private int position;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {

        if(position >= menuItems.size()){
            return false;
        }
        return true;
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
