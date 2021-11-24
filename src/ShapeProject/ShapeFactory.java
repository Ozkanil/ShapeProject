package ShapeProject;

import java.util.Random;

public class ShapeFactory {

    public static Shape produceShape (){
        Shape s=null;
        Random r=new Random();
        int i=r.nextInt(4)+1;
        switch (i){
            case 1:
               s= new Circle(3*i);

                break;
            case 2:
                s=new Rectangle(3*i,5*i);

            case 3:
                s= new Square(10*i);
                break;

            case 4:
                s=new Triangle(2,8,9,6);
                        break;
            default:
        }
        return s;
    }

}
