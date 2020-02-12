import org.junit.Assert;
import org.junit.Test;

public class BeverageShould {
    @Test
    public void cost_0_for_a_dark_roast() {

        Beverage darkRoast= new DarkRoast();

        Assert.assertTrue(darkRoast.checkPrice(0.0));
    }
}
