import java.util.Scanner;
public class TrungBinhCong_bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của dãy số
        System.out.print("Nhap so luong phan tu cua day so: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng để lưu dãy số
        int[] daySo = new int[n];

        // Nhập các phần tử của dãy số
        System.out.println("Nhap cac phan tu cua day so:");

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }

        // Tính trung bình cộng của dãy số
        double trungBinhCong = tinhTrungBinhCong(daySo);

        // In ra kết quả
        System.out.println("Trung binh cong cua day so la: " + trungBinhCong);

        scanner.close();
    }

    // Hàm tính trung bình cộng của một dãy số
    private static double tinhTrungBinhCong(int[] mang) {
        int tong = 0;

        for (int so : mang) {
            tong += so;
        }

        return (double) tong / mang.length;
    }
}
