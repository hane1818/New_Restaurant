public class MenuItem {
    private String name;
    private String desciption;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String desciption, boolean vegetarian, double price) {
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return desciption;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public double getPrice(){
        return price;
    }

    public void print(){
        System.out.print(" " + name);
        if(vegetarian) {
            System.out.print("(v)");
        }
        System.out.println(", " + price);
        System.out.println("     -- " + description);
    }

    public static void main(String[] args) {
        MenuItem menu = new MenuItem("Tomato Soup", "Use steamed tomato to cook.", true, 150);
        menu.print();
    }
}