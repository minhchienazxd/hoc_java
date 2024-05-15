import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class bai16_slider114chuong4 {
    public static void main(String[] args) {
        HashSet<String> fruitsSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm tên các loại trai cây vào HashSet
        System.out.println("Nhap ten cac loai trai cay (Nhap 'done' de ket thuc):");
        while (true) {
            String fruit = scanner.nextLine();
            if (fruit.equals("done")) {
                break; // Ket thuc khi nguoi dung nhap "done"
            }
            fruitsSet.add(fruit);
        }

        // Hien thi so phan tu trong HashSet
        System.out.println("So luong phan tu trong HashSet: " + fruitsSet.size());

        // Kiem tra va xoa loai trai cay
        System.out.print("Nhap ten loai trai cay can kiem tra va xoa: ");
        String fruitToCheck = scanner.nextLine();
        if (fruitsSet.contains(fruitToCheck)) {
            System.out.println("Tim thay loai trai cay '" + fruitToCheck + "' trong HashSet.");
            fruitsSet.remove(fruitToCheck);
            System.out.println("Loai trai cay '" + fruitToCheck + "' da duoc xoa khoi HashSet.");
        } else {
            System.out.println("Khong tim thay loai trai cay '" + fruitToCheck + "' trong HashSet.");
        }
        System.out.println("Cac phan tu con lai trong HashSet:");
        displayHashSet(fruitsSet);

        // Tao List moi va them phan tu vao List
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Cam");
        fruitList.add("Dua hau");
        fruitList.add("Dua");
        fruitList.add("Xoai");

        // Them cac phan tu cua List vao HashSet ban dau
        fruitsSet.addAll(fruitList);
        System.out.println("\nCac phan tu sau khi them tu List vao HashSet:");
        displayHashSet(fruitsSet);

        // Xoa cac phan tu cua List trong HashSet
        fruitsSet.removeAll(fruitList);
        System.out.println("\nCac phan tu sau khi xoa tu List khoi HashSet:");
        displayHashSet(fruitsSet);

        scanner.close();
    }

    // Hien thi cac phan tu cua HashSet su dung Iterator
    public static void displayHashSet(HashSet<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
