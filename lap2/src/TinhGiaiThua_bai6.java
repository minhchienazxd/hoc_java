import java.util.Scanner;
public class TinhGiaiThua_bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhap mot so nguyen duong: ");
        int soNguyenDuong = scanner.nextInt();

        // Kiểm tra nếu số nhập vào không phải là số nguyên dương
        if (soNguyenDuong <= 0) {
            System.out.println("Vui long nhap mot so nguyen duong.");
        } else {
            // Tính giai thừa của số đó
            long giaiThua = tinhGiaiThua(soNguyenDuong);

            // In ra kết quả
            System.out.println("Giai thua cua " + soNguyenDuong + " la: " + giaiThua);
        }

        scanner.close();
    }

    // Hàm tính giai thừa
    private static long tinhGiaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * tinhGiaiThua(n - 1);
        }
    }
}
