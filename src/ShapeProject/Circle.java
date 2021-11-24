package ShapeProject;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle", 0);
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing circle");

    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double calculateCircumferance() {
        return 2*Math.PI*radius;
    }
}
