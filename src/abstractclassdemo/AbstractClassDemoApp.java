package abstractclassdemo;

import abstractclasses.Shape;
import subclasses.Circle;
import subclasses.Rectangle;
import subclasses.Square;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */
public class AbstractClassDemoApp {

    public static void main(String[] args) {

        //create objects
        Rectangle rectangle = new Rectangle(3, 4.2, 3, 4, "rectangle", "blue");
        //polymorphism
        Shape square = new Square(2.5, 2, 4, "square", "green");
        Shape circle = new Circle(2.15, 5, 2, "circle", "yellow");

        //invoke method
        printShapeArea(square, rectangle);
        printShapeArea(circle);
    }

    //varargs method - method takes arbitrary number of arguments of one type
    private static void printShapeArea(Shape... shapes) {

        //varargs are arrays so we need to work with them just like we'd work with a normal array
        for (Shape shape : shapes) {
            System.out.printf("%s %s area = %.2f\n", shape.getColor(), shape.getName(), shape.calculateArea());
        }

    }
}
