package Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(5.0);
        shapes[2] = new Rectangle(4.0, 6.0);

        System.out.println("=== CHƯƠNG TRÌNH KIỂM THỬ INTERFACE COLORABLE ===");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Hình thứ " + (i + 1) + ": " + shapes[i]);
            System.out.printf("Diện tích: %.2f\n", shapes[i].getArea());

            if (shapes[i] instanceof Colorable) {
                Colorable colorableShape = (Colorable) shapes[i];
                System.out.print("Hướng dẫn tô màu: ");
                colorableShape.howToColor();
            }
        }
    }
}