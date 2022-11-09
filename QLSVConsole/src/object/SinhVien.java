package object;

public class SinhVien implements Comparable<SinhVien>{

    private  String maSinhVien;
    private  String hoTen;
    private float diemtb;

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public SinhVien(String maSinhVien, String hoTen, float diemtb) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemtb = diemtb;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(int diemtb) {
        this.diemtb = diemtb;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv=" + maSinhVien +
                ", hoTen=" + hoTen +
                ", diem=" + diemtb +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
}
