package de.schulung.strategy;

public class PercentageDiscount implements DiscountStrategy {

    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double value) {
        return value * (1.0 - percentage / 100);
    }
}
