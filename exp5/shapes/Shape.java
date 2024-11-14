package shapes;

public interface Shape {
    // Constants for length and height
    double length = 0.0; // These are effectively final and cannot be changed
    double height = 0.0; // These are effectively final and cannot be changed

    // Method to print area
    void printArea();
}
