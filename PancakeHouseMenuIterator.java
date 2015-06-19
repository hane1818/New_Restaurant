package plfinal;

public class PancakeHouseMenuIterator implements Iterator {
    private PancakeHouseMenu pancakeHouseMenu;
    private int index = 0;

    public PancakeHouseMenuIterator(PancakeHouseMenu pancakeHouseMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

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
