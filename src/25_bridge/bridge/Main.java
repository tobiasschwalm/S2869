package bridge;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(new Red()),
            new Circle(new Blue()),
            new Square(new Red()),
            new Square(new Blue())
        };
        for (Shape s : shapes) {
            System.out.println(s.draw());
        }
    }
}
