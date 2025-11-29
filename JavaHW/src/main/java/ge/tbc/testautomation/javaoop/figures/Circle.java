package ge.tbc.testautomation.javaoop.figures;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure{

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

}
