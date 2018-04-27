package сalculationOfFigures;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculationOfArea() {
        return Math.PI * r * r;
    }
}
