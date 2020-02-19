package decorators;

import millenial.MillennialGuy;

public abstract class GuyDecorator implements MillennialGuy {

    protected MillennialGuy guy;

    public GuyDecorator(MillennialGuy guy) {
        this.guy = guy;
    }

    @Override
    public String decorate() {
        return guy.decorate();
    }
}
