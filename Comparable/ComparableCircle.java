package Comparable;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    // Constructor không tham số
    public ComparableCircle() {
    }

    // Constructor khởi tạo bán kính
    public ComparableCircle(double radius) {
        super(radius);
    }

    // Constructor đầy đủ thuộc tính từ lớp cha và ông nội
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    // Cài đè phương thức để định nghĩa quy tắc sắp xếp cho hàm Arrays.sort()
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else
            return 0;
    }
}
