package sets;

import java.util.TreeSet;

public class demo_treeSet {
    public static void main(String[] args) {
        // Khởi tạo một TreeSet để lưu trữ các số nguyên
        TreeSet<Integer> numbers = new TreeSet<>();

        // Thêm các phần tử vào TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Hiển thị TreeSet ban đầu
        System.out.println("TreeSet ban dau:");
        displayTreeSet(numbers);

        // Thêm một phần tử mới vào TreeSet
        numbers.add(15);

        // Hiển thị TreeSet sau khi thêm phần tử mới
        System.out.println("\nTreeSet sau khi them mot phan tu moi:");
        displayTreeSet(numbers);
    }

    // Phương thức hiển thị các phần tử của TreeSet
    public static void displayTreeSet(TreeSet<Integer> set) {
        for (int number : set) {
            System.out.println(number);
        }
    }
}
