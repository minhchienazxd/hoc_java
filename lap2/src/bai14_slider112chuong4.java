import java.util.LinkedList;
import java.util.Scanner;

public class bai14_slider112chuong4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n từ bàn phím
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        // Tạo danh sách liên kết LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // Nhập n số nguyên dương vào danh sách
        System.out.println("Nhap " + n + " so nguyen duong:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                numbers.add(num);
            } else {
                System.out.println("So khong hop le, nhap lai so nguyen duong:");
                i--; // Yêu cầu nhập lại số nguyên dương
            }
        }

        // Tính trung bình cộng của các số chẵn trong danh sách
        double sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        double average = (count == 0) ? 0 : sum / count;

        // Hiển thị kết quả trung bình cộng của các số chẵn
        System.out.println("Trung binh cong cua cac so chan la: " + average);

        scanner.close();
    }
}
