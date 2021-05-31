package subclasses;

import abstractclasses.Shape;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */

//inheritance
public class Circle extends Shape {

    private double r;
    public static final double PI = 3.14;

    public Circle(double r, int posX, int posY, String name, String color) {
        //call to superclass' constructor; inheritance;
        super(posX, posY, name, color);
        this.r = r;
    }

    //method override; polymorphism;
    @Override
    public double calculateArea() {
        return r * r * PI;
    }

}
