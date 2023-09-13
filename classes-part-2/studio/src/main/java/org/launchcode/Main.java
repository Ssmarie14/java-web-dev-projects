
package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem burger = new MenuItem(5.00, "Juicy burger", "Entree", false);
        MenuItem frenchfries = new MenuItem(2.00, "French Fries", "Side", false);
        MenuItem soda = new MenuItem(1.00, "Soda", "Drink", false);
        ArrayList<MenuItem>menuItems = new ArrayList<>();
        Menu menu = new Menu(new Date(), menuItems);
        menu.add(burger);
        menu.add(frenchfries);
        menu.add(soda);
        menu.print();
    }

}
