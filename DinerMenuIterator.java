package plfinal;

public class DinerMenuIterator implements Iterator {
    private DinerMenu dinerMenu;
    private int index = 0;

    public DinerMenuIterator(DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
    }

    public boolean hasNext(){
        if(index < dinerMenu.getMenuItems().length)
        {
            return true;
        }

        return false;
    }

    public Object next(){
        index += 1;

        return dinerMenu.getMenuItems()[index-1];
    }

}
