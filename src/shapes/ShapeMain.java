package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String shapeType = sc.next();
        String color = sc.next();
        boolean filled = sc.nextBoolean();

        Shape shape;

        if (shapeType.equalsIgnoreCase("rectangle")) {
            double width = sc.nextDouble();
            double length = sc.nextDouble();

            shape = new Rectangle(color, filled, width, length);
        } else {
            double radius = sc.nextDouble();

            shape = new Circle(color, filled, radius);
        }

        System.out.println(shape);

        sc.close();
    }
}
