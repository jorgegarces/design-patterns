import pizzas.*;

public class PizzaShop {

    PizzaFactory pizzaFactory;

    public PizzaShop() {
        this.pizzaFactory = new PizzaFactory();
    }

    public Pizza orderPizza(String order) {

        Pizza pizza;
        pizza = pizzaFactory.createPizza(order);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}