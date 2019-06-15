package com.akon.compose;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterrator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterrator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);

    }

    public void printMenu(Iterrator iterrator){
        while (iterrator.hasNext()){
            MenuItem menuItem = (MenuItem) iterrator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + "---");
            System.out.println(menuItem.getDescription());
        }
    }
}
