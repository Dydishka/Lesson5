package сalculationOfFigures;

public class Main1 {
    public static void main(String[] args) {
        Figure square = new Square(8);
        System.out.println("Площадь Квадрата равна: " + square.calculationOfArea());
        Figure rectangle = new Rectangle(3,8);
        System.out.println("Площадь Прямоугольника равна: " + rectangle.calculationOfArea());
        Figure triangle = new Triangle(4,9);
        System.out.println("Площадь Треугольника равна: " + triangle.calculationOfArea());
        Figure circle = new Circle(3.5);
        System.out.println("Площадь Круга равна: " + circle.calculationOfArea());
    }
}

