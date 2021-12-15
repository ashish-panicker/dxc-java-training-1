package shapes;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Are of square = " + (side * side));

    }

}
