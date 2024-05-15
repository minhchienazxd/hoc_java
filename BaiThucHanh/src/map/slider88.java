package map;

import java.util.HashMap;

public class slider88 {
    public static void main(String[] args) {
        // Tạo một HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các cặp key-value vào HashMap
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        hashMap.put("Key3", 30);

        // Lấy giá trị tương ứng với một khóa cụ thể
        String key = "Key2";
        Integer value = hashMap.get(key);

        // In ra giá trị
        System.out.println("Gia tri cua " + key + " la: " + value);
    }
}
