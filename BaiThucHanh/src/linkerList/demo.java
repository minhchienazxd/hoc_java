package linkerList;

import java.util.LinkedList;

public class demo {
    public static void main(String[] args) {
        // Khoi tao mot LinkedList de luu tru cac so nguyen
        LinkedList<Integer> numbers = new LinkedList<>();

        // Them phan tu vao cuoi LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Hien thi LinkedList ban dau
        System.out.println("LinkedList ban dau:");
        displayLinkedList(numbers);

        // Them phan tu vao dau LinkedList
        numbers.addFirst(5);

        // Hien thi LinkedList sau khi them phan tu vao dau
        System.out.println("\nLinkedList sau khi them phan tu vao dau:");
        displayLinkedList(numbers);

        // Xoa phan tu o chi muc 2
        numbers.remove(2);

        // Hien thi LinkedList sau khi xoa phan tu o chi muc 2
        System.out.println("\nLinkedList sau khi xoa phan tu o chi muc 2:");
        displayLinkedList(numbers);

        // Lay va hien thi phan tu dau tien cua LinkedList
        int firstElement = numbers.getFirst();
        System.out.println("\nPhan tu dau tien cua LinkedList: " + firstElement);

        // Lay va hien thi phan tu cuoi cung cua LinkedList
        int lastElement = numbers.getLast();
        System.out.println("Phan tu cuoi cung cua LinkedList: " + lastElement);
    }

    // Phuong thuc hien thi cac phan tu cua LinkedList
    public static void displayLinkedList(LinkedList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
