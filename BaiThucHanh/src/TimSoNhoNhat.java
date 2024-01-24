import java.util.Scanner;
public class TimSoNhoNhat {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào hai số
        System.out.print("Nhap so thu nhat: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double soThuHai = scanner.nextDouble();

        // Gọi hàm để tìm số nhỏ nhất và in ra kết quả
        double soNhoNhat = timSoNhoNhat(soThuNhat, soThuHai);
        System.out.println("So nho nhat la: " + soNhoNhat);

        // Đóng đối tượng Scanner
        scanner.close();
    }

    // Hàm tìm số nhỏ nhất giữa hai số
    public static double timSoNhoNhat(double a, double b) {
        return Math.min(a, b);
    }
}
