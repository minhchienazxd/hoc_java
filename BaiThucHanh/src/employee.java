import java.util.Scanner;
public class employee {
    String ten;
    float NamSinh;
    float luong;
    String congViec;
    float tuoi;

    public static void main(String[] args) {}
    void nhapThongTin() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ten : ");
        ten = scanner.nextLine();

        System.out.println("nam sinh: ");
        NamSinh = scanner.nextFloat();

        System.out.println("luong: ");
        luong = scanner.nextFloat();

        System.out.println("cong viec: ");
        congViec = scanner.nextLine();
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
        System.out.println("chieu cao : " + luong);
        System.out.println("can nang : " + congViec);
        System.out.println("tuoi : " + tuoi);
    } 
public class ma extends employee{
    @Override
    void InThongTin()
    {
        System.out.println("ten : " + ten);
        System.out.println("nam sinh : " + NamSinh);
        System.out.println("chieu cao : " + luong);
        System.out.println("can nang : " + congViec);
        System.out.println("tuoi : " + tuoi);
    }

} 
}
