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
    public int compareTo(SinhVien o) {// ham nay trien khai tu Comparable<SinhVien>. dau vao co the là đối tượng nhưng hàm này chỉ có thể so sánh
        // chuỗi thôi nhé. nói đúng hơn là so sánh tứ tự chuỗi. phần ở trong hàm là tham số truyền vào. nếu tham số mặc định (có sẵn)
        // nó bé thua thì kết quả trả về là  1. tham số mặc định lớn hơn hơn thì -1. còn bằng nhau thì là 0.
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SinhVien) {
            SinhVien another = (SinhVien) obj;
            if (this.maSinhVien.equals(another.maSinhVien)) {
                return true;
            }
        }
        return false;
    }
}
