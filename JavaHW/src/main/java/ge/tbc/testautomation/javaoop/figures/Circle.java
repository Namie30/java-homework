package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
   /* private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }

    @Override
    public int compareTo(Object other) {
        // Casting from Object to Circle
        Circle otherCircle = (Circle) other;

        if (this.radius > otherCircle.radius) {
            return 1;
        } else if (this.radius < otherCircle.radius) {
            return -1;
        } else {
            return 0;
        }
    }*/

    /*
    //HW 6
    private double radius;
    private boolean valid;

    public Circle(double radius) {
        this.radius = radius;
        // Here we validate immediately after creation
        this.valid = validateFigure();
        if (!valid) {
            System.out.println("Invalid circle: radius must be positive. radius = " + radius);
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() { //
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackageName());
        //System.out.println(getClass().getPackage().getName());
    }

    // IResizable
    @Override
    public void doubleSize() {
        radius = radius * 2;                       //DoubleSize interface use
    }

    // IResizable
    @Override
    public void customSize(double byValue) {
        radius = radius * byValue;                 //CustomSize interface use
        valid = validateFigure();
    }

    // IValidFigure
    @Override
    public boolean validateFigure() {
        return radius > 0;                         //ValidateFigure interface use
    }

    public double getRadius() {
        return radius;
    }

    public boolean isValid() {
        return valid;
    }

     */


    /* Old HomeWork, HW 5
    private double radius;

    public Circle(double radius) {
        super();

        if (radius <= 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

        if (Figure.numberOfInstances > 5) {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
        this.radius = radius;
    }

     */


