package plfinal;

public class WaitressVersion1 implements Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public WaitressVersion1(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        System.out.println("MENU");
        System.out.println("----");
        printBreakfastMenu();
        printLunchMenu();
    }

    public void printBreakfastMenu()
    {
        System.out.println("BREAKFAST");
        for(MenuItem m : pancakeHouseMenu.getMenuItems())
        {
            m.print();
        }
        System.out.println("");
    }

    public void printLunchMenu()
    {
        System.out.println("LUNCH");
        for(MenuItem m : dinerMenu.getMenuItems())
        {
            m.print();
        }
        System.out.println("");
    }

    public void printVegetarianMenu()
    {
        System.out.println("FOR VEGETARIAN");
        for(MenuItem m : pancakeHouseMenu.getMenuItems())
        {
            if(isItemVegetarian(m.getName()))
            {
                m.print();
            }
        }

        for(MenuItem m : dinerMenu.getMenuItems())
        {
            if(isItemVegetarian(m.getName()))
            {
                m.print();
            }
        }
        System.out.println("");
    }

    public boolean isItemVegetarian(String name)
    {
        for(MenuItem m : pancakeHouseMenu.getMenuItems())
        {
            if(name.equals(m.getName()) && m.isVegetarian())
            {
                return true;
            }
        }

        for(MenuItem m : dinerMenu.getMenuItems())
        {
            if(name.equals(m.getName()) && m.isVegetarian())
            {
                return true;
            }
        }

        return false;
    }

}
