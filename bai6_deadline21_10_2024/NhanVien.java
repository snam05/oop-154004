package bai6_deadline21_10_2024;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan, heSoLuong;
    private final double LUONG_MAX = 20000000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NhanVien() {
        
    }

    public void inTTin() {
        System.out.println("Ten Nhan Vien: " + tenNhanVien);
        System.out.println("Luong Co Ban: " + luongCoBan);
        System.out.println("He So Luong: " + heSoLuong);
    }

    public double tinhLuong() {
        return (luongCoBan * heSoLuong);
    }

    public boolean tangLuong(double heSoLuong) {
        if (heSoLuong * this.luongCoBan <= LUONG_MAX) {
            this.heSoLuong = heSoLuong;
            return true;
        }
        else return false;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
