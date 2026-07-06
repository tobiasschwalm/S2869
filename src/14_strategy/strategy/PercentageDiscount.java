package strategy;

public class PercentageDiscount implements DiscountStrategy {

    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double value) {
        // TODO: Berechnen Sie den Preis nach prozentualem Rabatt
        //       Formel: value * (1.0 - percentage / 100)
        return 0;
    }
}
