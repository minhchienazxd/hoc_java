import java.util.Scanner;
public class TinhPhanTuLonNhatCuaMaTran_bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận
        System.out.print("Nhap so hang cua ma tran: ");
        int soHang = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int soCot = scanner.nextInt();

        // Khởi tạo ma trận với kích thước đã nhập
        int[][] maTran = new int[soHang][soCot];

        // Nhập các phần tử cho ma trận
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhap phan tu tai vi tri [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        // Tìm giá trị lớn nhất trong ma trận
        int max = maTran[0][0];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        // Hiển thị phần tử lớn nhất
        System.out.println("Phan tu lon nhat trong ma tran la: " + max);

        scanner.close();
    }
}
