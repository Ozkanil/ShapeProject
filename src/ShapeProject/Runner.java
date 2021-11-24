package ShapeProject;

public class Runner {
    public static void main(String[] args) {

        for  (int i=0;i<=4;i++){

        Shape s= ShapeFactory.produceShape();
        s.draw();
        System.out.println(s.calculateCircumferance());
        System.out.println(s.calculateArea());
        s.erase();


    }
}}