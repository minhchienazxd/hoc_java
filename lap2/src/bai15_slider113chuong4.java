import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
public class bai15_slider113chuong4 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm sinh viên vào danh sách
        System.out.println("Nhap thong tin sinh vien (Nhap ten trong de ket thuc):");
        while (true) {
            System.out.print("Nhap ten sinh vien: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break; // Ket thuc khi nguoi dung nhap ten rong
            }
            System.out.print("Nhap diem sinh vien: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Doc bo dong moi
            studentList.add(new Student(name, score));
        }

        // Dem va hien thi sinh vien phai thi lai
        int retakeCount = 0;
        System.out.println("\nDanh sach sinh vien phai thi lai:");
        for (Student student : studentList) {
            if (student.score <= 5) {
                retakeCount++;
                System.out.println("Ten: " + student.name + ", Diem: " + student.score);
            }
        }
        System.out.println("Tong so sinh vien phai thi lai: " + retakeCount);

        // Hien thi sinh vien co diem cao nhat
        double maxScore = Double.MIN_VALUE;
        System.out.println("\nSinh vien co diem cao nhat:");
        for (Student student : studentList) {
            if (student.score > maxScore) {
                maxScore = student.score;
            }
        }
        for (Student student : studentList) {
            if (student.score == maxScore) {
                System.out.println("Ten: " + student.name + ", Diem: " + student.score);
            }
        }

        // Tim kiem sinh vien theo ten
        System.out.print("\nNhap ten sinh vien can tim kiem: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        System.out.println("Thong tin sinh vien co ten '" + searchName + "':");
        for (Student student : studentList) {
            if (student.name.equals(searchName)) {
                System.out.println("Ten: " + student.name + ", Diem: " + student.score);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ten '" + searchName + "'.");
        }

        scanner.close();
    }
}
