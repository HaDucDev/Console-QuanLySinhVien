package function;


import object.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// DanhSachSinhVien
public class FunctionHandle {

    private ArrayList<SinhVien> dsSinhVien;

    public FunctionHandle(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;// đây là đẻ tạo đối tượng danh sách sinh viên
    }

    public FunctionHandle() {
        dsSinhVien = new ArrayList<SinhVien>(); // khi đối đối tường thì sẽ tạo thành mảng động
    }

    //1. Thêm sinh viên vào mảng
    public void themSinhVien(SinhVien sinhVien)
    {
        this.dsSinhVien.add(sinhVien);
    }

    //2. Kiem tra mang có trỗng không
    public boolean kiemtraDSrong(){
        return this.dsSinhVien.isEmpty();// trả về true or false
    }

    //3. in danh sách sinh viên
    public  void inDSSinhVien(){
        for (SinhVien i : dsSinhVien) {
            System.out.println(i);// khi viết như này nó sẽ tự động in ra kiểu định dạng ở hàm toString ở class SinhVien
        }
    }

    //4. Đếm tổng sinh viên
    public int tongSinyhVien(){
        return this.dsSinhVien.size();
    }

    //5. Kiểm tra xem sinh viên có tồn tại trong danh sách hay không. theo mssv
    public boolean kiemtratontaiSV(SinhVien sv){// cach nay ko dung dc
        return this.dsSinhVien.contains(sv);
    }

    public int kiemtratontaiSV1(SinhVien sv){// ok
        for (SinhVien i: dsSinhVien)
        {
            String a=i.getMaSinhVien();
            if(a.compareTo(sv.getMaSinhVien()) == 0)
            {
                return 0;
            }
        }
        return 1;
        //return this.dsSinhVien.contains(sv);
    }

    public boolean kiemtratontaiSV(String maSV){//ok
        for (SinhVien i: dsSinhVien)
        {
            String a=i.getMaSinhVien();
            if(a.equals(maSV))
            {
                return true;
            }
        }
        return false;
    }

    //6. Xóa 1 sinh viên ra khỏi danh sách, theo mssv
    public boolean xoa1SinhVien(SinhVien sv){
        return this.dsSinhVien.remove(sv);
    }

    public boolean xoa1SinhVien(String maSV){
        for (SinhVien i: dsSinhVien){
            String a= String.valueOf(i.getMaSinhVien());// loi nay do minh chua chuyen ve kia nguyen thuy.
            if(a.indexOf(maSV)>=0) {
                int x= a.indexOf(maSV);
                this.dsSinhVien.remove(x);
                return true;
            }
        }
        return false;
    }

    //7. Xoá tất cả sinh viên
    public void xoaAllSInhVien(){
        this.dsSinhVien.removeAll(dsSinhVien);
    }

    //8. tìm kiếm ten tất cả sinh viên dựa vào từ khóa nhập vào. // dụng cái này vs mssv tên luôn cx đc. vì mã số sv sẽ ko trung nhau
    public void searchSV_ten(String ten){
        for (SinhVien i: dsSinhVien){
            String a= String.valueOf(i.getHoTen());// loi nay do minh chua chuyen ve kia nguyen thuy.
            if(a.indexOf(ten)>=0) {
                System.out.println(i);
            }
        }
    }

    //9. sắp sếp sinh viên theo điểm từ cao đến thấp.

    public void sapXepSVDiemGiamDan() {
        Collections.sort(this.dsSinhVien, new Comparator<SinhVien>()
        {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2)
            {
                if(sv1.getDiemtb()<sv2.getDiemtb()) {return 1;}
                else if(sv1.getDiemtb()>sv2.getDiemtb()) {return -1;}
                else {return 0;}
            }
        });
    }



}
