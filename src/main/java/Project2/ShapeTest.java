package Project2;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println("Circle Area: " + circleArea); // Output: Circle Area: 78.53981633974483
        System.out.println("Circle Perimeter: " + circlePerimeter); // Output: Circle Perimeter: 31.41592653589793

        System.out.println("=================================================");

        Square square = new Square(4.0);
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Square Area: " + squareArea); // Output: Square Area: 16.0
        System.out.println("Square Perimeter: " + squarePerimeter); // Output: Square Perimeter: 16.0
    }
}