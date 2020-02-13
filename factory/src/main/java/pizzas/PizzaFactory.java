package pizzas;

public class PizzaFactory {

    Pizza pizza;

    public Pizza createPizza(String order) {
            if (order.equals("cheese")) pizza = new CheesePizza();
            else if (order.equals("pepperoni")) pizza = new PepperoniPizza();
            else if (order.equals("ham")) pizza = new HamPizza();
            return pizza;
    }
}