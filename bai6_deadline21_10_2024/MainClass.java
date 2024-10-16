package bai6_deadline21_10_2024;

public class MainClass {
    public static void main(String [] args) {
        PhongBan pb1 = new PhongBan("OOP Thay Tran Nhat Hoa");

        pb1.xoaNhanVien("Nguyen Van B");
        pb1.themNhanVien("Pham Son Nam", 2000000, 5.16);
        for (int i = 1; i < pb1.soNhanVien() + 1; i++) {
            pb1.inTTin(i);
        }
    }
}

