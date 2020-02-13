import org.junit.Assert;
import org.junit.Test;
import pizzas.Pizza;

public class PizzaShopShould {

    @Test
    public void prepare_a_cheese_pizza_if_cheese_is_passed_as_an_argument() {

        PizzaShop pizzaShop = new PizzaShop();
        Pizza cheesePizza = pizzaShop.orderPizza("cheese");

        Assert.assertEquals("Cheese Pizza", cheesePizza.getName());
    }
}
