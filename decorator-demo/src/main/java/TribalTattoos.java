public class TribalTattoos extends GuyDecorator {

    public TribalTattoos(MillenialGuy guy) {
        super(guy);
    }

    public String decorate() {
        return super.decorate() + decorateWithSomeTribalTattoos();
    }

    private String decorateWithSomeTribalTattoos() {
        return " with some Tribal Tattoos";
    }
}