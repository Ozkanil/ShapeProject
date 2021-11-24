package ShapeProject;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square", 4);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing square");

    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculateCircumferance() {
        return 4*side;
    }
}
