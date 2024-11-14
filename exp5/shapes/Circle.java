package shapes;

public class Circle implements Shape {
    private double radius; // Instance variable

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius; // Calculate area directly
        System.out.println("Area of Circle: " + area);
    }
}
