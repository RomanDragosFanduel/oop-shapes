public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    double calculatePerimeterOfTriangle() {
        return firstSide + secondSide + thirdSide;
    }

    public double calculateAreaOfTriangle() {
        double s = (firstSide + secondSide + thirdSide) / 2.0; // Calculate the semi-perimeter
        double area = Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide)); // Heron's formula
        return area;
    }
}
