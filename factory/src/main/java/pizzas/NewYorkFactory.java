package pizzas;

public class NewYorkFactory extends PizzaFactory{

    public Pizza createPizza(String order) {
        if (order.equals("cheese")) return new NewYorkCheesePizza();
        if (order.equals("pepperoni")) return new NewYorkPepperoniPizza();
        if (order.equals("ham")) return new NewYorkHamPizza();
        return null;
    }
}