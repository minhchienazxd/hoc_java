package map;

import java.util.HashMap;
import java.util.Map;

public class forEach {
    public static void main(String[] args) {
        // Tạo một HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các cặp key-value vào HashMap
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        hashMap.put("Key3", 30);

        // Hiển thị toàn bộ entry của HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
