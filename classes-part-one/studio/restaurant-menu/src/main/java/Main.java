import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem newItem = new MenuItem( 15.00,  "Some food",
                MenuItemCategory.APPETIZER,  true);

        //menu items
        //menu item
        //menu item

        Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>());
    currentMenu.getItems().add(newItem);

    //all items added to menu

        System.out.println(currentMenu.getItems());

        //iterate over the current menu array list
        //for MenuItem : currentMenu.getItems();
        //print out the properties you want
    }
}
