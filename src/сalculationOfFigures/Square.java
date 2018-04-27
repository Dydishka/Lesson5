package сalculationOfFigures;

public class Square extends Figure {
    private double a;
    Square(double a) {
        this.a = a;
    }
    public double calculationOfArea() {
        return a * a;
    }
}
