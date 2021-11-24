package ShapeProject;

public class Rectangle extends Shape {

    private double shortSide;
    private double longSide;

    public Rectangle(double shortSide, double longSide) {
        super("Rectangle", 4);
        this.shortSide=shortSide;
        this.longSide=longSide;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing rectangle");

    }

    @Override
    public double calculateArea() {
        return longSide*shortSide;
    }

    @Override
    public double calculateCircumferance() {
        return 2*(longSide+shortSide);
    }
}
