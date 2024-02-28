import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) {

    }
        float r;
        final float pi = 3.14f;
        float cv;
        float dt;
    //phuong thuc
    void nhapBanKinh() {
        System.out.println("r = ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
        scanner.close();
    }
    void tinhChuVi() {
        cv = 2 * pi * r;
    }
    void tinhDienTich() {
        dt = pi * r * r;
    }
    void inKetQua() {
        System.out.println("cv = " + cv);
        System.out.println("dien tich =" + dt);
    }

}
