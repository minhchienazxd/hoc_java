package ConNguoi;

public class mainPerson {
    public static void main(String[] args) {
        person cn = new person();
        System.out.println("ten: " + cn.ten);
        System.out.println("Tuoi: " + cn.tuoi);
        System.out.println("sdt: " + cn.sdt);
        cn.nhapThongTin();
        cn.InThongTin();
    }  
    
}
