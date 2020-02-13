package condiments;
import beverages.Beverage;

public class Whisky extends CondimentDecorator {
    Beverage beverage;

    public Whisky(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Irish";
    }

    public double cost() {
        return 2 + beverage.cost();
    }
}
