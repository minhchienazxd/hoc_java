package ConNguoi;
import java.util.Scanner;;
public class person {
    public String ten;
    public int tuoi;
    public String sdt;

    public person() {

        ten = "chien";
        tuoi = 18;
        sdt = "27462222222222228";
    }
    

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ten: ");
        ten = scanner.nextLine();
        System.out.println("tuoi: ");
        tuoi = scanner.nextInt();
        System.out.println("sdt: ");
        sdt = scanner.nextLine();
        
        scanner.close();

    }
    public void InThongTin() {
        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("sdt: " + sdt);
       
        
    }
    
}
