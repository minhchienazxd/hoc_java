package sets;

import java.util.LinkedHashSet;

public class demoLinkedHanshSet {
    public static void main(String[] args) {
        // Khoi tao mot LinkedHashSet de luu tru cac chuoi
        LinkedHashSet<String> fruitsSet = new LinkedHashSet<>();

        // Them cac phan tu vao LinkedHashSet
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");

        // Hien thi LinkedHashSet ban dau
        System.out.println("LinkedHashSet ban dau:");
        displayLinkedHashSet(fruitsSet);

        // Xoa mot phan tu bat ky khoi LinkedHashSet
        String removedElement = removeRandomElement(fruitsSet);
        System.out.println("\nPhan tu " + removedElement + " da bi xoa khoi LinkedHashSet:");

        // Hien thi LinkedHashSet sau khi xoa phan tu
        System.out.println("LinkedHashSet sau khi xoa phan tu:");
        displayLinkedHashSet(fruitsSet);
    }

    // Phuong thuc xoa mot phan tu bat ky khoi LinkedHashSet
    public static String removeRandomElement(LinkedHashSet<String> set) {
        // Neu LinkedHashSet khong rong
        if (!set.isEmpty()) {
            // Lay phan tu bat ky
            String removedElement = set.iterator().next();
            // Xoa phan tu do khoi LinkedHashSet
            set.remove(removedElement);
            // Tra ve phan tu da bi xoa
            return removedElement;
        }
        // Neu LinkedHashSet rong, tra ve null
        return null;
    }

    // Phuong thuc hien thi cac phan tu cua LinkedHashSet
    public static void displayLinkedHashSet(LinkedHashSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
