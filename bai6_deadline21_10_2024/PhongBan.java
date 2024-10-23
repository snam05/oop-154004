package bai6_deadline21_10_2024;

public class PhongBan {
    private String tenPhongBan;
    private final int NHANVIEN_MAX = 101;
    private static int soLuongNhanVien = 0;
    private final NhanVien nhanVien[] = new NhanVien[NHANVIEN_MAX];

    // Khoi tao PhongBan so luong nhan vien va thong tin duoc nhap vao tu ban phim
/* 
    public PhongBan(String tenPhongBan) {
        for (int i = 0; i < NHANVIEN_MAX; i++) {
            nhanVien[i] = new NhanVien();
        }
        
        this.tenPhongBan = tenPhongBan;

        System.out.print("Nhap so luong nhan vien can them: ");
        int tempSoLuongNhanVien;
        Scanner sc = new Scanner(System.in);
        tempSoLuongNhanVien = sc.nextInt();

        for (int i = 1; i < tempSoLuongNhanVien + 1; i++) {
            System.out.println("Nhap ten nhan vien " + i + ": ");
            nhanVien[i].setTenNhanVien(sc.nextLine());
            System.out.println("Nhap Luong co ban cua Nhan vien " + i + ": ");
            nhanVien[i].setLuongCoBan(sc.nextDouble());
            System.out.println("Nhap He so luong cua Nhan vien " + i + ": ");
            nhanVien[i].setHeSoLuong(sc.nextDouble());
        }

        soLuongNhanVien = tempSoLuongNhanVien;
    }
*/

    public PhongBan(String tenPhongBan) {
        for (int i = 0; i < NHANVIEN_MAX; i++) {
            nhanVien[i] = new NhanVien();
        }
        
        this.tenPhongBan = tenPhongBan;

        soLuongNhanVien = 3;

        // Khoi tao mau la 3 sinh vien, neu muon khoi tao dua vao ban phim thi su dung constructor duoc comment ben tren
        nhanVien[1].setTenNhanVien("Nguyen Van A");
        nhanVien[1].setLuongCoBan(1800000);
        nhanVien[1].setHeSoLuong(3.80);

        nhanVien[2].setTenNhanVien("Nguyen Van B");
        nhanVien[2].setLuongCoBan(1500000);
        nhanVien[2].setHeSoLuong(2.45);

        nhanVien[3].setTenNhanVien("Nguyen Van C");
        nhanVien[3].setLuongCoBan(2150000);
        nhanVien[3].setHeSoLuong(3.10);

    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void inTTin(int stt) {
        nhanVien[stt].inTTin();
    }

    public int soNhanVien() {
        return soLuongNhanVien;
    }

    public double tongLuong() {
        double tempTongLuong = 0;
        for (int i = 1; i < soLuongNhanVien + 1; i++) {
            tempTongLuong += nhanVien[i].tinhLuong();
        }
        return tempTongLuong;
    }

    public boolean themNhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        if (soLuongNhanVien >= 100) return false;
        else {
            soLuongNhanVien++;
            nhanVien[soLuongNhanVien].setTenNhanVien(tenNhanVien);
            nhanVien[soLuongNhanVien].setLuongCoBan(luongCoBan);
            nhanVien[soLuongNhanVien].setHeSoLuong(heSoLuong);
        }
        return true;
    }

    public boolean xoaNhanVien(String tenNhanVien) {
        int tempLocateOfNhanVien = -1;
            for (int i = 1; i < soLuongNhanVien + 1; i++) {
                if (nhanVien[i].getTenNhanVien().equals(tenNhanVien) == true) {
                    tempLocateOfNhanVien = i;
                    break;
                }
            }
        if (tempLocateOfNhanVien != -1) {
            soLuongNhanVien--;
            for (int i = tempLocateOfNhanVien; i < soLuongNhanVien + 2; i++) {
                nhanVien[i] = nhanVien[i + 1];
            }
            return true;
        }
        else return false;
    }
}
