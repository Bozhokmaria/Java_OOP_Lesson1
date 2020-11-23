package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны а прямоугольника");
        double side1 = Double.parseDouble(scanner.next());

        System.out.println("Введите длину стороны b прямоугольника");
        double side2 = Double.parseDouble(scanner.next());
        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(side1);
        rectangle.setSide2(side2);
        double area = rectangle.areaCalculator(side1,side2);
        double perimeter = rectangle.perimeterCalculator(side1, side2);


        System.out.println("Периметр прямоугольника: " + perimeter);

        System.out.println("Площадь прямоугольника: " + area);

    }
}
// output: Введите длину стороны а прямоугольника
//10.6
//Введите длину стороны b прямоугольника
//5.5
//Периметр прямоугольника: 32.2
//Площадь прямоугольника: 58.3