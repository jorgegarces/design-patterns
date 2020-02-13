import org.junit.Assert;
import org.junit.Test;
import pizzas.ChicagoFactory;
import pizzas.NewYorkFactory;
import pizzas.Pizza;

public class PizzaShopShould {

    @Test
    public void prepare_a_cheese_pizza_if_cheese_is_passed_as_an_argument() {

        PizzaShop pizzaShop = new PizzaShop(new NewYorkFactory());
        Pizza cheesePizza = pizzaShop.orderPizza("cheese");

        Assert.assertEquals("New York Cheese Pizza", cheesePizza.getName());
    }


    @Test
    public void prepare_a_pepperoni_pizza_if_pepperoni_is_passed_as_an_argument() {

        PizzaShop pizzaShop = new PizzaShop(new ChicagoFactory());
        Pizza cheesePizza = pizzaShop.orderPizza("cheese");

        Assert.assertEquals("Chicago Cheese Pizza", cheesePizza.getName());
    }

}