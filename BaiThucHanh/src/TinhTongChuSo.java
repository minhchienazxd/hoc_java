import java.util.Scanner;
public class TinhTongChuSo {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số nguyên
        System.out.print("Nhap vao mot so nguyen (n > 0): ");
        int n = scanner.nextInt();

        // Kiểm tra n có lớn hơn 0 không
        if (n <= 0) {
            System.out.println("Vui long nhap so nguyen lon hon 0.");
        } else {
            // Gọi hàm để tính tổng các chữ số
            int tong = tinhTongChuSo(n);

            // In ra kết quả
            System.out.println("Tong cac chu so cua so " + n + " là: " + tong);
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }

    // Hàm tính tổng các chữ số của một số nguyên
    public static int tinhTongChuSo(int number) {
        int tong = 0;

        // Lặp qua từng chữ số và cộng vào tổng
        while (number != 0) {
            tong += number % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            number /= 10;        // Loại bỏ chữ số cuối cùng
        }

        return tong;
    }
}
