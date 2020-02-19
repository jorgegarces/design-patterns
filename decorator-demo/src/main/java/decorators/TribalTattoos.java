package decorators;

import decorators.GuyDecorator;
import millenial.MillennialGuy;

public class TribalTattoos extends GuyDecorator {

    public TribalTattoos(MillennialGuy guy) {
        super(guy);
    }

    public String decorate() {
        return super.decorate() + decorateWithSomeTribalTattoos();
    }

    private String decorateWithSomeTribalTattoos() {
        return " with some Tribal Tattoos";
    }
}