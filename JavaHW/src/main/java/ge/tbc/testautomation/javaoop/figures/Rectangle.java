package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}

    /*
    //Old HomeWork 5-6

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getLength() {
        return 2 * (width + height);   //P
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackageName());
    }
 */

    /*
    private double a;
    private double b;

    public Rectangle (double a, double b)
    {
        this.a=a;
        this.b=b;
    }

     @Override
    public double getArea()
     {
         return a*b;
     }

     @Override
    public double getPerimeter()
     {
         return 2 * (a + b);
     }
*/

