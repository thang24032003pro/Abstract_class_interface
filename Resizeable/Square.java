package Resizeable;

public class Square extends Rectangle {
    
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide();
    }
}