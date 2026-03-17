package de.schulung.strategy;

public class Order {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getTotal(double value) {
        return discountStrategy.apply(value);
    }
}
