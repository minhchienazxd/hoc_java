package map;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
     public static void main(String[] args) {
        // Tạo một TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Thêm các cặp key-value vào TreeMap
        treeMap.put("Key1", 10);
        treeMap.put("Key2", 20);
        treeMap.put("Key3", 30);

        //thay đổi giá trị một entry
        treeMap.put("key1", 30);

        // Hiển thị toàn bộ entry của TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
