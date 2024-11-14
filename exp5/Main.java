import shapes.Rectangle;
import shapes.Triangle;
import shapes.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, height);
                    rectangle.printArea();
                    break;

                case 2:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    height = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    triangle.printArea();
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.printArea();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
