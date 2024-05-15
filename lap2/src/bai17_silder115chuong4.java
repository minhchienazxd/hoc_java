import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SinhVien {
    String maSV;
    String hoTen;
    String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
}
public class bai17_silder115chuong4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, SinhVien> danhSachSinhVien = new HashMap<>();

        // Nhập danh sách n sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSV = scanner.nextLine();
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();
            SinhVien sv = new SinhVien(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sv);
        }

        // Nhập tên lớp và hiển thị sinh viên thuộc lớp đó
        System.out.print("Nhap ten lop can tim kiem: ");
        String lopCanTim = scanner.nextLine();
        System.out.println("Cac sinh vien thuoc lop " + lopCanTim + ":");
        for (SinhVien sv : danhSachSinhVien.values()) {
            if (sv.getLop().equalsIgnoreCase(lopCanTim)) {
                System.out.println("Ma SV: " + sv.getMaSV() + ", Ho va ten: " + sv.getHoTen());
            }
        }

        // Nhập mã sinh viên và hiển thị họ tên và lớp tương ứng
        System.out.print("Nhap ma sinh vien can tim kiem: ");
        String maSVCantim = scanner.nextLine();
        if (danhSachSinhVien.containsKey(maSVCantim)) {
            SinhVien sv = danhSachSinhVien.get(maSVCantim);
            System.out.println("Ho va ten: " + sv.getHoTen() + ", Lop: " + sv.getLop());
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + maSVCantim);
        }

        scanner.close();
    }
}
