public class TinhTongSoChan {
    public static int tinhTongSoChan(int[] mang) {
        int tong = 0;
        for (int so : mang) {
            if (so % 2 == 0) {
                tong += so;
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        // Vi du su dung
        int[] mangSo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ketQua = tinhTongSoChan(mangSo);
        System.out.println("Tong cac so chan trong mang la: " + ketQua);
    }
}


