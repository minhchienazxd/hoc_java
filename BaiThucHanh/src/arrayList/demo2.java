package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Khoi tao mot ArrayList de luu tru cac so nguyen
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Nhap cac phan tu cho ArrayList tu ban phim
        System.out.println("Nhap cac phan tu cho ArrayList (Nhap 'done' de ket thuc):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break; // Ket thuc nhap khi nguoi dung nhap "done"
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so nguyen hoac 'done' de ket thuc.");
            }
        }
        
        // Tim va hien thi phan tu lon nhat trong ArrayList
        if (!numbers.isEmpty()) {
            int maxNumber = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) > maxNumber) {
                    maxNumber = numbers.get(i);
                }
            }
            System.out.println("Phan tu lon nhat trong ArrayList la: " + maxNumber);
        } else {
            System.out.println("ArrayList trong. Khong co phan tu nao de hien thi.");
        }

        scanner.close();
    }
}
