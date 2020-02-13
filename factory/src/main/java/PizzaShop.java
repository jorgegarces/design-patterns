import pizzas.*;

public class PizzaShop {

    PizzaFactory factory;

    public PizzaShop(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String order) {
        Pizza pizza;

        pizza = factory.createPizza(order);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}