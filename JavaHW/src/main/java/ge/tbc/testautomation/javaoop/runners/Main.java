package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;


public class Main {

    public static void main(String[] args) {

        try {
            Circle c1 = new Circle(-5.0);
        } catch (RadiusException e) {
            System.out.println("RadiusException caught: " + e.getMessage());
        }

        try {
            Circle c2 = new Circle(1.0);
            Circle c3 = new Circle(2.0);
            Circle c4 = new Circle(3.0);
            Circle c5 = new Circle(4.0);
            Circle c6 = new Circle(5.0);
            Circle c7 = new Circle(6.0); // Here we should have a problem :D
        } catch (LimitException e) {
            System.out.println("LimitException caught: " + e.getMessage());
        }
          catch (RadiusException e) {
        // We can also add this, just in case, if someone tryes to put negative number
        System.out.println("RadiusException caught: " + e.getMessage());
    }

        stringOperations();
        phoneValidationDemo();
    }


    private static void stringOperations() {

        String sentence = "Test Automation Bootcamp 12, 2025";

        // Automation in lowercase
        String[] words = sentence.split(" ");
        String automationWord = words[1].toLowerCase();   //We say 1 because in this case the is 0 and 1 is automation
        System.out.println("Automation lowercase: " + automationWord);

        // line by line words
        System.out.println("Words in sentence:");
        for (String w : words) {
            System.out.println(w);
        }

        // length
        System.out.println("Length of sentence: " + sentence.length());

        // spaces will be turned in dashes
        String replaced = sentence.replace(" ", "-");
        System.out.println("With dashes: " + replaced);
    }


    private static boolean phoneNumberValidation(String phoneNumber) {

        String cleaned = phoneNumber.replace("-", "");

        String regex = "^(555|595|592|599)[0-9]{6}$";

        return cleaned.matches(regex);
    }


    private static void phoneValidationDemo() {

        String[] phoneNumbers = {
                "599-14-15-16",
                "555-12-34-56",
                "592-00-00-00",
                "593-14-15-16",
                "595141516",
                "555-123-4567"
        };

        for (String number : phoneNumbers) {
            boolean isValid = phoneNumberValidation(number);
            System.out.println(number + " -> " + (isValid ? "VALID" : "INVALID"));
        }
    }
}



        /* HW - 4
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


         */

        //Privious HomeWork (3)
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


