import java.util.Scanner;

public class XacDinhNhomTuoi_bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();

        // Nhập năm sinh
        System.out.print("Nhap nam sinh cua ban: ");
        int namSinh = scanner.nextInt();

        // Tính tuổi
        int tuoi = 2024 - namSinh; // Giả sử năm 2024 là năm hiện tại

        // Kiểm tra và hiển thị nhóm tuổi
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien.");
        } else if (tuoi >= 16 && tuoi < 45) {
            System.out.println("Ban " + ten + " o do tuoi chenh venh.");
        } else {
            System.out.println("Ban " + ten + " da gan dat xa troi.");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }

}

