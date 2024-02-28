import java.util.Scanner;
public class ConNguoi {
    String ten;
    float NamSinh;
    float CanNang;
    float ChieuCao;
    float tuoi;

    public static void main(String[] args) {}
    void nhapThongTin() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ten : ");
        ten = scanner.nextLine();

        System.out.println("nam sinh: ");
        NamSinh = scanner.nextFloat();

        System.out.println("can nang: ");
        CanNang = scanner.nextFloat();

        System.out.println("chieu cao: ");
        ChieuCao = scanner.nextFloat();
        scanner.close();
    }
    void TinhTuoi() 
    {
        tuoi = 2024 - NamSinh;
    }
    void InThongTin()
    {
        System.out.println("ten : " + ten);
        System.out.println("nam sinh : " + NamSinh);
        System.out.println("chieu cao : " + ChieuCao);
        System.out.println("can nang : " + CanNang);
        System.out.println("tuoi : " + tuoi);


    }



    
    
}
