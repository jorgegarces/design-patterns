import org.junit.Assert;
import org.junit.Test;

public class BeverageShould {

    @Test
    public void cost_1_for_a_ristretto() {

        Beverage ristretto = new Ristretto();

        Assert.assertTrue(ristretto .checkPrice(1.0));
    }

    @Test
    public void cost_1dot5_for_a_decaf(){

        Beverage decaf = new Decaf();

        Assert.assertTrue(decaf.checkPrice(1.5));
    }
}
