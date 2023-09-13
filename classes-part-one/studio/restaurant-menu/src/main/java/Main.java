import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem burger = new MenuItem( 15.00,  "Burger",
                MenuItemCategory.MAIN_COURSE,  true);
        MenuItem frenchFries = new MenuItem( 2.00, "French Fries", MenuItemCategory.SIDE, false);
        MenuItem blondieBrownie = new MenuItem(5.00, "Blondie Brownie", MenuItemCategory.DESSERT, true);
        MenuItem chipsAndDip = new MenuItem(7.00, "Chips & Dip", MenuItemCategory.APPETIZER, false);
        MenuItem soda = new MenuItem(2.50, "Soda", MenuItemCategory.DRINK, false);//menu items
        //menu item
        //menu item

        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>());
        currentMenu.add(burger);
        currentMenu.add(frenchFries);
        currentMenu.add(blondieBrownie);
        currentMenu.add(chipsAndDip);
        currentMenu.add(soda);
        currentMenu.delete(burger);

    //all items added to menu

//        System.out.println(currentMenu.getItems());
currentMenu.printMenu();

        //iterate over the current menu array list
        //for MenuItem : currentMenu.getItems();
        //print out the properties you want
    }
}
