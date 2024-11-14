package shapes;

public class Rectangle implements Shape {
    private double length; // Instance variable
    private double height; // Instance variable

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = this.length * this.height; // Calculate area directly
        System.out.println("Area of Rectangle: " + area);
    }
}
