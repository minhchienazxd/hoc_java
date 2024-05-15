import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai13_slider111chuong4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Nhập dãy số nguyên
        System.out.println("Nhap vao cac so nguyen (Nhap -1 de ket thuc):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }

        // Tìm số nguyên lớn nhất
        int max = findMax(numbers);
        System.out.println("So nguyen lon nhat la: " + max);

        // Nhập vào số nguyên để xoá
        System.out.println("Nhap vao so nguyen de xoa:");
        int deleteNum = scanner.nextInt();
        deleteElement(numbers, deleteNum);

        // Sắp xếp và in dãy số
        Collections.sort(numbers);
        System.out.println("Day so sau khi sap xep:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        scanner.close();
    }
    

    // Tìm số nguyên lớn nhất trong ArrayList
    public static int findMax(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Xoá phần tử có giá trị bằng num khỏi ArrayList
    public static void deleteElement(ArrayList<Integer> numbers, int num) {
        numbers.removeIf(n -> n == num);
    }
    
}
