package ge.tbc.testautomation.javaoop.figures;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;

public class Circle extends Figure {

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

}
