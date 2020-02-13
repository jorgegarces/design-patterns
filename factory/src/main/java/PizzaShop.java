import pizzas.CheesePizza;
import pizzas.HamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;

public class PizzaShop {

    Pizza pizza;

    public Pizza orderPizza(String order) {
        if (order.equals("cheese")) this.pizza = new CheesePizza();
        if (order.equals("pepperoni")) this.pizza = new PepperoniPizza();
        if (order.equals("ham")) this.pizza = new HamPizza();
        return doOrder();
    }

    private Pizza doOrder() {
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}