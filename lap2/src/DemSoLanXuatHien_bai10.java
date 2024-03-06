import java.util.Scanner;
public class DemSoLanXuatHien_bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi không quá 80 ký tự
        System.out.print("Nhap chuoi (khong qua 80 ky tu): ");
        String chuoi = scanner.nextLine();

        if (chuoi.length() > 80) {
            System.out.println("Chuoi qua dai. Vui long nhap lai.");          
        }

        // Nhập ký tự cần đếm
        System.out.print("Nhap ky tu can dem: ");
        char kyTuCanDem = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int soLanXuatHien = demSoLanXuatHien(chuoi, kyTuCanDem);

        // In ra kết quả
        System.out.println("So lan xuat hien cua ky tu '" + kyTuCanDem + "' trong chuoi la: " + soLanXuatHien);

        scanner.close();
    }

    // Hàm đếm số lần xuất hiện của ký tự trong chuỗi
    private static int demSoLanXuatHien(String chuoi, char kyTu) {
        int soLanXuatHien = 0;

        for (char currentChar : chuoi.toCharArray()) {
            if (currentChar == kyTu) {
                soLanXuatHien++;
            }
        }

        return soLanXuatHien;
    }    
}
