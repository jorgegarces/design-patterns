package pizzas;

public abstract class Pizza {
    String name;
    Integer price;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }
}
