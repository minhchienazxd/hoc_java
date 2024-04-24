package model;

public class nhanVien {
    protected String ten;
    protected long luong;

    public nhanVien() {
    }

    public nhanVien(String ten) {
        this.ten = ten;
    }
    protected String loaiNhanVien() {
        return "";
    }
    public void xuatThongtin() {
        System.out.println("==== Nhân viên: " + ten + "====");
        
    }
}
