package plfinal;

import java.util.ArrayList;

public class PancakeHouseMenu {
    private ArrayList<MenuItem>  menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem mi = new MenuItem(name, description, vegetarian, price);
        menuItems.add(mi);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(this);
    }

    public static void main(String[] args) {
        PancakeHouseMenu p = new PancakeHouseMenu();

        for(MenuItem m : p.getMenuItems())  //for each loop
        {
            m.print();
        }
    }
}
