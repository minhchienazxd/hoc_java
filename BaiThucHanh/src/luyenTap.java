import java.util.Scanner;

public class luyenTap {
    public static void main(String[] args) {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        so = scanner.nextInt();
        if(so > 0){
            System.out.println("so nguyen duong");
        }
        else{
            System.out.println("so nguyen aam");
        }
        scanner.close();
    }
}
