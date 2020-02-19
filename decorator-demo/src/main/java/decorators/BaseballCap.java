package decorators;

import millenial.MillennialGuy;

public class BaseballCap extends GuyDecorator {

    public BaseballCap(MillennialGuy guy) {
        super(guy);
    }

    public String decorate() {
        return super.decorate() + decorateWithBaseballCap();
    }

    private String decorateWithBaseballCap() {
        return " with a BaseBall Cap";
    }
}