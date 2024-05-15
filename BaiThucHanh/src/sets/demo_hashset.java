package sets;

import java.util.HashSet;

public class demo_hashset {
    public static void main(String[] args) {
        // Khoi tao mot HashSet de luu tru cac chuoi
        HashSet<String> fruitsSet = new HashSet<>();

        // Them cac phan tu vao HashSet
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");

        // Hien thi HashSet ban dau
        System.out.println("HashSet ban dau:");
        displayHashSet(fruitsSet);

        // Them mot phan tu moi vao HashSet
        fruitsSet.add("Mango");

        // Hien thi HashSet sau khi them phan tu moi
        System.out.println("\nHashSet sau khi them mot phan tu moi:");
        displayHashSet(fruitsSet);

        // Xoa mot phan tu trong hanshSet
        fruitsSet.remove("Banana");

        // Hien thi HashSet sau khi xoa phan tu 
        System.out.println("\nHashSet sau khi xoa mot phan tu:");
        displayHashSet(fruitsSet);
    }

    // Phuong thuc hien thi cac phan tu cua HashSet
    public static void displayHashSet(HashSet<String> set) {
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
