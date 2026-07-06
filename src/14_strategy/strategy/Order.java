package strategy;

public class Order {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getTotal(double value) {
        // TODO: Delegieren Sie an discountStrategy.apply(value)
        return 0;
    }

}
