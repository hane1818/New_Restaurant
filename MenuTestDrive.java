package plfinal;

public class MenuTestDrive {
    public static void main(String[] args) {
        /** Test for WaitressVersion1 */
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new WaitressVersion1(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}

