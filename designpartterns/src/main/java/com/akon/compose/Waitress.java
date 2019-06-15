package com.akon.compose;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);

    }

    public void printMenu(Iterator iterrator){
        while (iterrator.hasNext()){
            MenuItem menuItem = (MenuItem) iterrator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + "---");
            System.out.println(menuItem.getDescription());
        }
    }
}
