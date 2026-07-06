package bridge;

public abstract class Shape {

    protected final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
