package pizzashop;
import pizzashop.menu.Pizza;

public class App {
    public static void main(String[] args) {
        int size = 12;
        String crust = "thin";
        String[] toppings = {"Cheese", "tomato Sauce"};

        Pizza cheesePizza;          // Only in stack
        cheesePizza = new Pizza(toppings);  // Only in heap
        System.out.println(cheesePizza.toString());
        System.out.println(crust);
        
        System.out.println("Finished running PizzaShop");
    }
}