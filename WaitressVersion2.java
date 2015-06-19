package plfinal;

public class WaitressVersion2 implements Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public WaitressVersion2(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    public void printBreakfastMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        printMenu(pancakeIterator);
    }

    public void printLunchMenu(){
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            menuItem.print();
        }
    }

    public void printVegetarianMenu(){
        System.out.println("FOR VEGETARIAN");
        Iterator iterator = pancakeHouseMenu.createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if(isItemVegetarian(menuItem.getName()))
            {
                menuItem.print();
            }
        }
        iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if(isItemVegetarian(menuItem.getName()))
            {
                menuItem.print();
            }
        }
    }

    public boolean isItemVegetarian(String name){
        Iterator iterator = pancakeHouseMenu.createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if(menuItem.getName().equals(name) && menuItem.isVegetarian())
            {
                return true;
            }
        }
        iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if(menuItem.getName().equals(name) && menuItem.isVegetarian())
            {
                return true;
            }
        }

        return false;
    }

}
