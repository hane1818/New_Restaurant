package plfinal;

public class DinerMenu {
    public static final int MAX_ITEMS = 6;
    private MenuItem[] menuItems;
    private int totalMenuItems = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", false, 3.89);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem mi = new MenuItem(name, description, vegetarian, price);
        menuItems[totalMenuItems] = mi;
        totalMenuItems += 1;
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(this);
    }

    public static void main(String[] args) {
        DinerMenu d = new DinerMenu();

        for(MenuItem m : d.getMenuItems())
        {
            m.print();
        }
    }
}
