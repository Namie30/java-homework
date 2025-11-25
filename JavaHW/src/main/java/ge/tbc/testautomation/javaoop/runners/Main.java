package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;


public class Main {
    public static void main(String[] args)
    {
        //New HomeWork (Also added loop print as was suggested in previous HW, see below)

        Figure figure =  new Figure();

        System.out.println(figure.getArea());

        Rectangle rect1 = new Rectangle(5, 6);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(3.14, 9);
        System.out.println(rect2.getPerimeter());
        System.out.println(rect2.getArea());

        //We can also do like this

        Rectangle[] box =
                {
                        new Rectangle(5, 12),
                        new Rectangle(3.14, 8),
                        new  Rectangle(3.14, 9.89),
                        new  Rectangle(7.2, 15.6),
                };
        for(Rectangle i:box)
        {
         System.out.println(i.getArea());
         System.out.println(i.getPerimeter());
        }

        Triangle[] box1 =
                {
                        new Triangle(5, 12, 21, 4),
                        new Triangle(3.14, 8, 5.3, 8.4),
                        new Triangle(3.14, 9.89, 9.5, 7),
                };
        for(Triangle i: box1)
        {
            System.out.println(i.getArea());
            System.out.println(i.getPerimeter());
        }

        System.out.println(Triangle.TriangleDescription());

        HelperFunctions.compareRectangles(rect1,rect2);


        //Privious HomeWork
        /*
        Circle circle = new Circle(3.14);
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle));

        Circle circle2 = new Circle(7);
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle2));

        Circle circle3 = new Circle(42);
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle3));

        Circle circle4 = new Circle(2.879);
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle4));

        Circle circle5 = new Circle(96);
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle5));

        //Bonus
        Circle circle6 = new Circle(Math.random() * 10); //In firts run radius was 3.309583600444801, this will change for every run
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle6));

        */

        /*

        //So in Privious HomeWork I could have done also like this, with loop, rather than writing evything by hand and one by one
        // lets fix it

        double[] box = {3.14, 7, 42, 2.879, 96, Math.random() * 10};

        for(double i: box)
        {
           Circle circle = new Circle(i);
            System.out.println(Circle.numberOfCircleInstances);
            System.out.println(Util.circleToString(circle));
        }

        */
    }
}
