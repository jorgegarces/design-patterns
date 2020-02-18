public abstract class GuyDecorator implements MillenialGuy {

    private MillenialGuy guy;

    public GuyDecorator(MillenialGuy guy) {
        this.guy = guy;
    }


    @Override
    public String decorate() {
        return guy.decorate();
    }
}
