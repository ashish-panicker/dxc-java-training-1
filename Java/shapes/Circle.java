package shapes;


public class Circle implements Shape {

    private final double PI;
    private double radius;

    public Circle(double radius) {
        PI = 3.14;
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of the circle is = " + (PI * (radius * radius)));
    }

}
