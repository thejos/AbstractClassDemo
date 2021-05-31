package abstractclasses;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */

/*abstract class; cannot be instantiated, only subclassed; 
purpose of an abstract class is to function as a base for subclasses.*/
public abstract class Shape {

    //attributes; data hiding; encapsulation;
    private int posX;
    private int posY;
    private String name;
    private String color;

    //constructors
    public Shape(int posX, int posY, String name, String color) {
        this.posX = posX;
        this.posY = posY;
        this.name = name;
        this.color = color;
    }

    //getters
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    /*abstract methods; if a class has one or more abstract methods that class must be declared abstract;
    abstract class can have non-abstract methods; subclasses of an abstract class must implement (override) 
    all abstract methods of its abstract superclass; 
    the non-abstract methods of the superclass are just inherited as they are.
    They can also be overridden, if needed;*/
    public abstract double calculateArea();
}
