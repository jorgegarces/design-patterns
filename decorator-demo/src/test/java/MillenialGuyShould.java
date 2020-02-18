import org.junit.Assert;
import org.junit.Test;

public class MillenialGuyShould {

    @Test
    public void get_decorated_with_a_baseball_cap() {
        MillenialGuy guy = new BaseballCap(new MillenialGuyImpl());

        Assert.assertEquals("Millenial Guy with a BaseBall Cap", guy.decorate());
    }

    @Test
    public void get_decorated_with_a_baseball_cap_and_some_tribal_tattoos() {
        MillenialGuy guy = new TribalTattoos(new BaseballCap(new MillenialGuyImpl()));

        Assert.assertEquals("Millenial Guy with a BaseBall Cap with some Tribal Tattoos", guy.decorate());
    }
}
