import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

public Menu(Date d, ArrayList<MenuItem> i) {
    this.lastUpdated = d;
    this.items = i;

}

public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }
    public void add(MenuItem menuItem) {
        items.add(menuItem);

    }
    public void printMenu() {
//        System.out.println(this);
        System.out.println(lastUpdated + "\n");
//        System.out.println(items);
        for(MenuItem menuItem: items) {
            System.out.println(menuItem.getDescription()+ " " + menuItem.getPrice()+
                    " " + menuItem.getCategory()+ " " + menuItem.isNew());
        }
    }
}
