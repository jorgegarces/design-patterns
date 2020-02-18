import org.junit.Assert;
import org.junit.Test;

public class MillenialGuyShould {
    @Test
    public void get_decorated_with_a_baseball_cap() {
        MillenialGuy guy = new BaseballCap(new MillenialGuyImpl());

        Assert.assertEquals("Millenial Guy with a BaseBall Cap", guy.decorate());
    }
}