package strategy;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        double originalPrice = 100.0;

        order.setDiscountStrategy(new PercentageDiscount(20));
        double finalPrice = order.getTotal(originalPrice);
        System.out.printf("20%% Rabatt: %.1f -> %.1f%n", originalPrice, finalPrice);
        // Erwartet: 80.0

        order.setDiscountStrategy(new NoDiscount());
        finalPrice = order.getTotal(originalPrice);
        System.out.printf("Kein Rabatt: %.1f -> %.1f%n", originalPrice, finalPrice);
        // Erwartet: 100.0

        order.setDiscountStrategy(new PercentageDiscount(15));
        finalPrice = order.getTotal(originalPrice);
        System.out.printf("Sommer-Sale (15%%): %.1f -> %.1f%n", originalPrice, finalPrice);
        // Erwartet: 85.0
    }
}
