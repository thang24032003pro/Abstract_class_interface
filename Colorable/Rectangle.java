package Colorable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public double getLength() { return length; }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length;
    }
}