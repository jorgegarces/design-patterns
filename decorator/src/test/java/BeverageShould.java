import org.junit.Assert;
import org.junit.Test;

public class BeverageShould {

    @Test
    public void cost_1_for_a_ristretto() {

        Beverage ristretto = new Ristretto();

        Assert.assertTrue(ristretto .checkPrice(1.0));
    }
}
