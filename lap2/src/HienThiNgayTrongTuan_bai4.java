import java.util.Scanner;
public class HienThiNgayTrongTuan_bai4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số nguyên từ 1 đến 7
        System.out.print("Nhap vao mot so tu 1 den 7: ");
        int soNgay = scanner.nextInt();

        // Gọi hàm để hiển thị ngày trong tuần và in ra kết quả
        hienThiNgayTrongTuan(soNgay);

        // Đóng đối tượng Scanner
        scanner.close();
    }

    // Hàm hiển thị ngày trong tuần dựa trên số nguyên đầu vào
    public static void hienThiNgayTrongTuan(int soNgay) {
        switch (soNgay) {
            case 1:
                System.out.println("Ngay thu 2: Thu Hai");
                break;
            case 2:
                System.out.println("Ngay thứ 3: Thu Ba");
                break;
            case 3:
                System.out.println("Ngay thứ 4: Thu Tu");
                break;
            case 4:
                System.out.println("Ngay thứ 5: Thu Nam");
                break;
            case 5:
                System.out.println("Ngay thứ 6: Thu Sau");
                break;
            case 6:
                System.out.println("Ngay thứ 7: Thu Bay");
                break;
            case 7:
                System.out.println("Ngay Chu Nhat");
                break;
            default:
                System.out.println("So khong hop le Vui long nhap so tu 1 den 7.");
        }
    }
}
