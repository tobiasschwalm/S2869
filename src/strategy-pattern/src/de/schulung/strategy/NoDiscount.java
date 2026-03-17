package de.schulung.strategy;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double apply(double value) {
        return value;
    }
}
