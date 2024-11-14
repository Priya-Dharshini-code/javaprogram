package shapes;

public class Triangle implements Shape {
    private double base; // Instance variable
    private double height; // Instance variable

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * base * height; // Calculate area directly
        System.out.println("Area of Triangle: " + area);
    }
}
