package ShapeProject;

public class Triangle extends Shape{

    private int base;
    private int height;
    private int side1;
    private int side2;

    public Triangle(int base, int height, int side1, int side2) {
        super("Triangle", 3);
        this.base = base;
        this.height = height;
        this.side1=side1;
        this.side2=side2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangel");

    }

    @Override
    public void erase() {
        System.out.println("Erasing triangle");

    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculateCircumferance() {
        return base+side1+side2;
    }
}
