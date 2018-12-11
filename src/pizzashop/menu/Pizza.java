package pizzashop.menu;

import java.util.Arrays;

public class Pizza {
    int size;
    String crust;
    String[] toppings;

    /* 
    Access modifiers: public, (default), proteted, private
    private:   Only accessible within the class
    (default): Only accessible within the package
    protected: Only accessible within the package, and subclasses outside
    public:    Accessible anywhere
    */
    public Pizza(String... toppings) {
        System.out.println(Arrays.toString(toppings));
    }
    public Pizza() {
       
    }
    public Pizza(int size, String crust, String... toppings) { 
        this.size = 2 * size;
        crust = "Nope";
        this.crust = crust;
        this.toppings = toppings;
    }


    public String toString() {
        return "Pizza size: " + size + "\nPizza crust: " + crust
            + "Pizza toppings: " + Arrays.toString(toppings);
    }
}