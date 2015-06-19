package plfinal;

import plfinal.PancakeHouseMenu;
import plfinal.DinerMenu;

public class WaitressVersion1 implements Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public WaitressVersion1(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        printBreakfastMenu();
        printLunchMenu();
    }

    public void printBreakfastMenu()
    {
        for(MenuItem m : pancakeHouseMenu.getMenuItems())
        {
            m.print();
        }
    }

    public void printLunchMenu()
    {
        for(MenuItem m : dinerMenu.getMenuItems())
        {
            m.print();
        }
    }

    public void printVegetarianMenu()
    {
        for(MenuItem m : pancakeHouseMenu)
        {
            if(isItemVegetarian(m.getName()))
            {
                m.print();
            }
        }

        for(MenuItem m : dinerMenu)
        {
            if(isItemVegetarian(m.getName()))
            {
                m.print();
            }
        }
    }

    public boolean isItemVegetarian(String name)
    {
        for(MenuItem m : pancakeHouseMenu)
        {
            if(name.equals(m.getName()) && m.isVegetarian())
            {
                return true;
            }
        }

        for(MenuItem m : dinerMenu)
        {
            if(name.equals(m.getName()) && m.isVegetarian())
            {
                return true;
            }
        }

        return false;
    }

}