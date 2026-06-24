package Resizeable;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(4.0);

        System.out.println("=== KIỂM THỬ THAY ĐỔI KÍCH THƯỚC HÌNH HỌC ===");

        for (Resizeable shape : shapes) {
            System.out.println("----------------------------------------");
            System.out.println("Đối tượng: " + shape);
            
            double areaBefore = 0;
            if (shape instanceof Circle) {
                areaBefore = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaBefore = ((Rectangle) shape).getArea();
            }

            System.out.printf("Diện tích TRƯỚC khi resize: %.2f\n", areaBefore);

            double percent = Math.random() * 99 + 1;
            System.out.printf("Tiến hành tăng kích thước thêm: %.2f%%\n", percent);
            
            shape.resize(percent);

            double areaAfter = 0;
            if (shape instanceof Circle) {
                areaAfter = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaAfter = ((Rectangle) shape).getArea();
            }

            System.out.printf("Diện tích SAU khi resize: %.2f\n", areaAfter);
        }
    }
}
