package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        // Tạo một HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các cặp key-value vào HashMap
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        hashMap.put("Key3", 30);

        // Hiển thị toàn bộ entry của HashMap
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
