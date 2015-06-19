package plfinal;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        /** Test for WaitressVersion1 */
        Waitress waitress = new WaitressVersion1(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();

        /** Test for WaitressVersion2 */
        waitress = new WaitressVersion2(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();

    }
}
