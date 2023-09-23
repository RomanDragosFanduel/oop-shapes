public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumferenceOfCircle() {
        return 2 * Math.PI * radius;
    }

    public double calculateAreaOfCircle() {
        return Math.PI * Math.pow(radius, 2);
    }
}
