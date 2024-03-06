import java.util.Scanner;
public class TinhTongSoNguyen_bai5 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        int tong = 0;

        // Sử dụng vòng lặp để nhập các số và tính tổng
        while (true) {
            System.out.print("Nhap vao mot so nguyen: ");
            int soNguyen = scanner.nextInt();

            // Kiểm tra nếu số nhập vào là 0
            if (soNguyen == 0) {
                break; // Kết thúc vòng lặp nếu nhập số 0
            }

            tong += soNguyen;

            // Kiểm tra nếu tổng lớn hơn 100
            if (tong > 100) {
                System.out.println("Tong cac so da nhap vuot qua 100. Ket thuc chuong trinh.");
                break; // Kết thúc vòng lặp nếu tổng lớn hơn 100
            }
        }
        // In ra tổng các số đã nhập
        System.out.println("Tong cac so da nhap la: " + tong);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
