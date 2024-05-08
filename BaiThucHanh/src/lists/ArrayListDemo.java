package lists;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    private static ArrayList<student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("===== MENU =====");
            System.out.println("1. Them sinh viên");
            System.out.println("2. Sua thông tin sinh viên");
            System.out.println("3. Xoa sinh viên");
            System.out.println("4. Hien thi danh sach sinh viên");
            System.out.println("5. Thoatt");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void addStudent() {
        System.out.println("nhap so luong sinh vien muon them: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < n; i++){
            student st = new student();
            st.inputInfo();
            studentList.add(st);
        }
        System.out.println("them sinh vien thanh cong");
    }

    private static void editStudent() {
        System.out.print("vi tri sinh vien can sua: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (index >= 0 && index < studentList.size()) {
            student student = studentList.get(index);
            student.editInfo();
            System.out.println("sua thong tin thanh cong.");
        } else {
            System.out.println("vi tri khong hop le.");
        }
    }

    private static void deleteStudent() {
        System.out.print("vi tri sinh vien can xoa: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
            System.out.println("Xoa sinh viên thanh cong.");
        } else {
            System.out.println("Vi tri khong hop le.");
        }
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("===== DANH SÁCH SINH VIÊN =====");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println("Sinh viên thứ " + (i + 1) + ":");
                studentList.get(i).displayInfo();
                System.out.println();
            }
        }
    }
}
