
public class HienThiSoChiaHetCho5 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 trong phap vi tu 0 den 20:");

        // Sử dụng vòng lặp để kiểm tra và hiển thị các số chia hết cho 5
        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
