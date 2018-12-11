package pizzashop.menu;

public class Drink {
    String name;
    int ounces;

    public Drink(String name, int ounces) {
        this.name = name;
        this.ounces = ounces;
    }

    public String toString() { 
        return String.format("%sOz of %s", ounces, name);
    }
}