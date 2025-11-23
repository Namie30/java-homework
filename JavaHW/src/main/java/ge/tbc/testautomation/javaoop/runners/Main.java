package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;


public class Main {
    public static void main(String[] args)
    {
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

    }
}
