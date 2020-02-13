import beverages.Beverage;
import beverages.Decaf;
import beverages.Ristretto;
import condiments.Milk;
import condiments.Whisky;
import org.junit.Assert;
import org.junit.Test;

public class BeverageShould {

    @Test
    public void cost_1_for_a_ristretto() {

        Beverage ristretto = new Ristretto();

        Assert.assertTrue(ristretto.checkPrice(1.0));
        Assert.assertEquals("Ristretto", ristretto.getDescription());
    }

    @Test
    public void cost_1dot5_for_a_decaf(){

        Beverage decaf = new Decaf();

        Assert.assertTrue(decaf.checkPrice(1.5));
        Assert.assertEquals("Decaf", decaf.getDescription());
    }

    @Test
    public void cost_4_for_an_irish_milk_decaf(){
        Beverage irishMilkdecaf = new Whisky(new Milk(new Decaf()));

        Assert.assertTrue( irishMilkdecaf.checkPrice(4));
        Assert.assertEquals("Decaf, Milk, Irish", irishMilkdecaf.getDescription());
    }
}