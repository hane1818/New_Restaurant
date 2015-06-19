package plfinal;

public class DinerMenuIterator implements Iterator {
    private DinerMenu dinerMenu = new DinerMenu();
    private int index = 0;

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
