import decorators.BaseballCap;
import decorators.TribalTattoos;
import millenial.MillennialGuy;
import millenial.NewBornMillennial;
import org.junit.Assert;
import org.junit.Test;

public class MillennialGuyShould {

    @Test
    public void get_decorated_with_a_baseball_cap() {
        MillennialGuy guy = new BaseballCap(new NewBornMillennial());

        Assert.assertEquals("Millenial Guy with a BaseBall Cap", guy.decorate());
    }

    @Test
    public void get_decorated_with_a_baseball_cap_and_some_tribal_tattoos() {
        MillennialGuy guy = new TribalTattoos(new BaseballCap(new NewBornMillennial()));

        Assert.assertEquals("Millenial Guy with a BaseBall Cap with some Tribal Tattoos", guy.decorate());
    }
}
