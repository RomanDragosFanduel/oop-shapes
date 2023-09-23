public class Main {
    public static void main(String[] args) {
        // Create instances of circle, rectangle, square and triangle
        Circle circle = new Circle(25);
        Rectangle rectangle = new Rectangle(20, 14);
        Square square = new Square(13);
        Triangle triangle = new Triangle(10, 4, 24);

        // Calculate and display perimeters of circle, rectangle, square and triangle
        System.out.println("Circle Circumference: " + circle.calculateCircumferenceOfCircle());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeterOfRectangle());
        System.out.println("Square Perimeter: " + square.calculatePerimeterOfSquare());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeterOfTriangle());

        // Calculate and display areas of circle, rectangle, square and triangle
        System.out.println("Circle Area: " + circle.calculateAreaOfCircle());
        System.out.println("Rectangle Area: " + rectangle.calculateAreaOfRectangle());
        System.out.println("Square Area: " + square.calculateAreaOfSquare());
        System.out.println("Triangle Area: " + triangle.calculateAreaOfTriangle());
    }
}
