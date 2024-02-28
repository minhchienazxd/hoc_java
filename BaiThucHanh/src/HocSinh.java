import java.util.Scanner;
public class HocSinh {

    public static void main(String[] args) {
    }
        float msv;
        float diemToan;
        float diemVan;
        float diemHoa;
        float dtp;
        float t;
   
    void nhapThongTin() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("msv: ");
        msv = scanner.nextFloat();

        System.out.println("diem toan: ");
        diemToan = scanner.nextFloat();

        System.out.println("diem van: ");
        diemVan = scanner.nextFloat();

        System.out.println("diem hoa: ");
        diemHoa = scanner.nextFloat();
              
        scanner.close();
    }
    void tinhTongDiem() 
    {
        t = diemHoa + diemToan +diemVan;
    }
    void inDiemTong() 
    {
        System.out.println("diem tong = " + t);
    }
    void tinhDiemTrungBinh() 
    {
        dtp = t / 3;
    }
    void inDiem() 
    {
        System.out.println("diem trung binh = " + dtp);
    }
 
}
