import java.util.Scanner;
public class DemKyTu_bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        // Đếm số ký tự thường, ký tự hoa và số trong chuỗi
        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;

        for (char kyTu : chuoi.toCharArray()) {
            if (Character.isLowerCase(kyTu)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                soKyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                soChuSo++;
            }
        }

        // In ra kết quả
        System.out.println("So ky tu thuong: " + soKyTuThuong);
        System.out.println("So ky tu hoa: " + soKyTuHoa);
        System.out.println("So chu so: " + soChuSo);

        scanner.close();
    }
}
