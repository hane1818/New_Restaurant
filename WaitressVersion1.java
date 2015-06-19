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
}