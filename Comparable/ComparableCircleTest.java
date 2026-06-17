package Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle(); // Bán kính mặc định là 1.0
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("=== Danh sách trước khi sắp xếp (Pre-sorted): ===");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        // Thực hiện sắp xếp mảng dựa trên cơ chế so sánh compareTo() vừa viết
        Arrays.sort(circles);

        System.out.println("\n=== Danh sách sau khi sắp xếp tăng dần (After-sorted): ===");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
