package ConNguoi;
class person {
    String ten = "chien";
    float tuoi = 19;
    String sdt = "281931381783";
    void persons() {
        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("sdt: " + sdt);
        
    }
}
class employee extends person {
    float luong = 1000;
    void employees() {
        System.out.println("luong: " + luong);
    }
}
class employee_pasttime extends employee {
    int bonus = 0;
    void employee_pasttimes() {
        System.out.println("bonus: " + bonus);
    }
}
class employee_fulltime extends employee {
    int bonus = 100;
    void employee_fulltimes() {
        System.out.println("bonus: " + bonus);
    }
}

