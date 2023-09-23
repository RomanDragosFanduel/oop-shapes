public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculatePerimeterOfSquare() {
        return 4 * side;
    }

    public double calculateAreaOfSquare() {
        return side * side;
    }
}
