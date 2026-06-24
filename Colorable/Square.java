package Colorable;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "A Square with side = " + getWidth();
    }
}
