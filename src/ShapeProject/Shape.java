package ShapeProject;

public abstract class Shape implements Drawable, Erasable {

    private String name;
    private int numOfSides;

    public Shape(String name, int numOfSides) {
        this.name = name;
        this.numOfSides = numOfSides;
    }

    public abstract double calculateArea();
    public abstract double calculateCircumferance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }
}
