import java.util.Arrays;
import java.util.Scanner;
public class SapXepMang_bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng A có n phần tử
        int[] mangA = new int[n];

        // Nhập các phần tử của mảng A từ bàn phím
        System.out.println("Nhap cac phan tu cua mang A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mangA[i] = scanner.nextInt();
        }

        // Sắp xếp mảng A theo thứ tự tăng dần
        Arrays.sort(mangA);

        // In ra mảng số ban đầu
        System.out.println("Mang ban dau:");
        inMang(mangA);

        // In ra mảng đã sắp xếp theo thứ tự tăng dần
        System.out.println("Mang da sap xep theo thu tu tang dan:");
        inMang(mangA);

        scanner.close();
    }

    // Hàm in mảng
    private static void inMang(int[] mang) {
        for (int i : mang) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
