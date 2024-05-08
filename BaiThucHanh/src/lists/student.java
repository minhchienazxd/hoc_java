package lists;
import java.util.Scanner;

public class student {
    public String FullName;
    public int Age;


    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten cua sinh viên: ");
        FullName = scanner.nextLine();
        System.out.print("Nhap tuoi cua sinh viên: ");
        Age = Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    public void displayInfo() {
        System.out.println("Họ và tên: " + FullName);
        System.out.println("Tuổi: " + Age);
    }

    public void addInfo(String FullName, int Age) {
        this.FullName = FullName;
        this.Age = Age;
    }

    public void editInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn sửa gì? (1 - Họ và tên, 2 - Tuổi): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        switch (choice) {
            case 1:
                System.out.print("Nhập họ và tên mới của sinh viên: ");
                FullName = scanner.nextLine();
                break;
            case 2:
                System.out.print("Nhập tuổi mới của sinh viên: ");
                Age = scanner.nextInt();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        scanner.close();
        }
    }
    
}
