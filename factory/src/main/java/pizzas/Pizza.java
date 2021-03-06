package pizzas;
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();
    Integer price;


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size() ; i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaShop Box");
    }

    public String getName() {
        return name;
    }
}