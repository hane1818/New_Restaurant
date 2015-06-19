package plfinal;

public class PancakeHouseMenuIterator implements Iterator {
    private PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    private int index = 0;

    public boolean hasNext(){
        if(index < pancakeHouseMenu.getMenuItems().size())
        {
            return true;
        }

        return false;
    }

    public Object next(){
        index += 1;

        return pancakeHouseMenu.getMenuItems().get(index-1);
    }

}
