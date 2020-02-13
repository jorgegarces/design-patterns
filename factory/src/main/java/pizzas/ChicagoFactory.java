package pizzas;

public class ChicagoFactory extends PizzaFactory{

    public Pizza createPizza(String order) {
        if (order.equals("cheese")) return new ChicagoCheesePizza();
        return null;
    }
}