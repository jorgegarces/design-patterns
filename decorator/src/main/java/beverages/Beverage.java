package beverages;

public abstract class Beverage {
    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public boolean checkPrice(double value){
        return this.cost() == value;
    }

    public abstract double cost();
}