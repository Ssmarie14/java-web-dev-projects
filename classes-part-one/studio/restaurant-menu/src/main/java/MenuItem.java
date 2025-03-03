public class MenuItem {
    private double price;
    private String description;
    private MenuItemCategory category;
    private boolean isNew;

    public MenuItem(double price, String description, MenuItemCategory category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MenuItemCategory getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(MenuItemCategory category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

//    @Override
//    public String toString() {
//        return description +
//                "\n" + price;
//    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", isNew=" + isNew +
                '}';
    }
}
