package shapes;

public class Circle extends Shape{
    private double radius;
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return 3.1416*radius*radius;
    }

    @Override
    public double getPerimeter(){
        return 2*3.14156*radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" +
                super.toString() + "\n" +
                "Radius: " + radius + "\n" +
                String.format("Area         : %.2f", getArea())      + "\n" +
                String.format("Circumference: %.2f", getPerimeter());
    }

    public double getRadius() { return radius; }
}
