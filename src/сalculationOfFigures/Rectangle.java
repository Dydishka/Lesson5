package сalculationOfFigures;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculationOfArea() {
        return a * b;
    }
}
