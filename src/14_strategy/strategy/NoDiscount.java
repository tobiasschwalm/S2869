package strategy;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double apply(double value) {
        // TODO: Geben Sie den Wert unverändert zurück
        return 0;
    }
}
