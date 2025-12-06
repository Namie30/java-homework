package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;

public class ContainersAndComparing {
    public static void main(String[] args) {
        ArrayList<String> phoneNumbers = new ArrayList<>();

        phoneNumbers.add("555-542-231");
        phoneNumbers.add("555-887-987");
        phoneNumbers.add("555-161-143");
        phoneNumbers.add("555-189-6667");

       // System.out.println(phoneNumbers);
        System.out.println("Phone numbers: ");
        Iterator<String> iterator = phoneNumbers.iterator();

        while (iterator.hasNext()) {
            String phone = iterator.next();
            System.out.println(phone);
        }
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Tsotne", "555-542-231");
        contacts.put("Irina", "555-887-987");
        contacts.put("Tinatin", "555-161-143");
        contacts.put("Luka",    "555-189-6667");

        System.out.println("Contacts whose phone contains '8':");
         for (Map.Entry<String, String> entry : contacts.entrySet()) {
                String name = entry.getKey();
                String phone = entry.getValue();

                if (phone.contains("8")) {
                    System.out.println(name + " -> " + phone);
                }
        }

         //TreeSet - Circle
        Set<Circle> circleTreeSet = new TreeSet<>();

        circleTreeSet.add(new Circle(7.89));
        circleTreeSet.add(new Circle(3.0));
        circleTreeSet.add(new Circle(2.0));
        circleTreeSet.add(new Circle(4.2));
        circleTreeSet.add(new Circle(2.0)); // duplicate
        circleTreeSet.add(new Circle(3.0)); // duplicate
        circleTreeSet.add(new Circle(5.5));
        circleTreeSet.add(new Circle(1.5)); // duplicate
        circleTreeSet.add(new Circle(6.0));
        circleTreeSet.add(new Circle(0.5));

        System.out.println("TreeSet of circles: ");
        System.out.println(circleTreeSet);

        //HashSet - Cricle
        Set<Circle> circleHashSet = new HashSet<>();

        circleHashSet.add(new Circle(7.89));
        circleHashSet.add(new Circle(3.0));
        circleHashSet.add(new Circle(2.0));
        circleHashSet.add(new Circle(4.2));
        circleHashSet.add(new Circle(2.0)); // duplicate
        circleHashSet.add(new Circle(3.0)); // duplicate
        circleHashSet.add(new Circle(5.5));
        circleHashSet.add(new Circle(1.5)); // duplicate
        circleHashSet.add(new Circle(6.0));
        circleHashSet.add(new Circle(0.5));

        System.out.println("HashSet of circles: ");
        System.out.println(circleHashSet);

        //ArrayList - Rectangle
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(5, 4));
        rectangles.add(new Rectangle(1, 10));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(6, 2));

      //  Collections.sort(rectangles);
        System.out.println(rectangles);

        //TreeSet - Rectangle
        Set<Rectangle> rectSet = new TreeSet<>();
        rectSet.add(new Rectangle(2,3));
        rectSet.add(new Rectangle(5,4));
        rectSet.add(new Rectangle(1,10));

        System.out.println(rectSet);

    }

}
