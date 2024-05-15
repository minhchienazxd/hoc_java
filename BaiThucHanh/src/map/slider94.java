package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class slider94 {
    public static void main(String[] args) {
        // Tạo một LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm các cặp key-value vào LinkedHashMap
        linkedHashMap.put("Key1", 10);
        linkedHashMap.put("Key2", 20);
        linkedHashMap.put("Key3", 30);

        // In ra LinkedHashMap ban đầu
        System.out.println("LinkedHashMap ban dau:");
        printMap(linkedHashMap);

        // Xóa một phần tử ngẫu nhiên khỏi LinkedHashMap
        removeRandomElement(linkedHashMap);

        // In ra LinkedHashMap sau khi xóa
        System.out.println("\nLinkedHashMap sau khi xoa mot phan tu:");
        printMap(linkedHashMap);
    }

    // Phương thức in ra các cặp key-value trong LinkedHashMap
    public static void printMap(LinkedHashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Phương thức xóa một phần tử ngẫu nhiên khỏi LinkedHashMap
    public static void removeRandomElement(LinkedHashMap<String, Integer> map) {
        // Kiểm tra nếu map không rỗng
        if (!map.isEmpty()) {
            // Tạo một mảng chứa tất cả các khóa
            Object[] keys = map.keySet().toArray();

            // Chọn một khóa ngẫu nhiên từ mảng
            Random random = new Random();
            Object randomKey = keys[random.nextInt(keys.length)];

            // Xóa phần tử có khóa được chọn ngẫu nhiên
            map.remove(randomKey);
        }
    }
}
