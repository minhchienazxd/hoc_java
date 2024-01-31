import java.util.Scanner;
public class HienThiKyTuChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        // Hiển thị từng ký tự trên một dòng
        System.out.println("Cac ky tu trong chuoi:");

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }

        scanner.close();
    }
}
