package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figure implements IResizable, IValidFigure {

    private double a;
    private double b;
    private double c;
    private boolean valid;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.valid = validateFigure();
        if (!valid) {
            System.out.println("Invalid triangle created with sides: " + a + ", " + b + ", " + c);
        }
    }

    @Override
    public double getArea() {
        double s = getLength() / 2.0;  //Semi-P
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));         // Heron's formula
    }

    @Override
    public double getLength() {
        return a + b + c;   //P
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        a *= 2;
        b *= 2;
        c *= 2;
    }

    @Override
    public void customSize(double byValue) {
        a *= byValue;
        b *= byValue;
        c *= byValue;
        valid = validateFigure();
    }

    @Override
    public boolean validateFigure() {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }

    public boolean isValid() {
        return valid;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    /*
    private  double a;
    private  double b;
    private  double c;
    private double h; //Height

    public Triangle(double a, double b, double c, double h)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    @Override
    public double getArea()
    {
        return (a * h) / 2;
    }

    @Override
    public double getPerimeter()
    {
        return a + b + c;
    }

    public static String TriangleDescription()
    {
        return "Triangle has 3 sides and a height";
    }

     */
}
