package subclasses;

import abstractclasses.Shape;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */
public class Square extends Shape {

    private double sideA;

    public Square(double sideA, int posX, int posY, String name, String color) {
        super(posX, posY, name, color);
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

}
