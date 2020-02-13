import pizzas.*;

public class PizzaShop {

    public Pizza orderPizza(String order) {
        Pizza pizza;

        pizza = PizzaFactory.createPizza(order);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}