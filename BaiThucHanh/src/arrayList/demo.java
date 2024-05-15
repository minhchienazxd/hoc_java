package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        // Khoi tao mot ArrayList de luu tru cac so nguyen
        ArrayList<Integer> numbers = new ArrayList<>();

        // Them cac phan tu vao ArrayList
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Hien thi ArrayList ban dau
        System.out.println("ArrayList ban dau:");
        displayArrayList(numbers);

        // Sap xep cac phan tu trong ArrayList
        Collections.sort(numbers);

        // Hien thi ArrayList sau khi sap xep
        System.out.println("\nArrayList sau khi sap xep:");
        displayArrayList(numbers);

        // Xoa phan tu tu ArrayList
        numbers.remove(1);

        // Hien thi ArrayList sau khi xoa phan tu thu hai
        System.out.println("\nArrayList sau khi xoa phan tu thu hai:");
        displayArrayList(numbers);
    }

    // Phuong thuc hien thi cac phan tu cua ArrayList
    public static void displayArrayList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
