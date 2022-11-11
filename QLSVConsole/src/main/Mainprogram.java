package main;

import function.FunctionHandle;
import object.SinhVien;

import java.util.Scanner;

public class Mainprogram {
    public static void main(String[] agrs){

        Scanner a = new Scanner(System.in);
        FunctionHandle functionHandle = new FunctionHandle();

        int luachonso=0;
        do {// dang loi 6 va 7

            System.out.println("*************MENU*************");
            System.out.println("Vui lòng nhấp số đê chọn chức năng: ");
            System.out.println(
                            "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên .\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	tổng số sinh viên có trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên sinh viên.\n"
                            + "9.	Hiển thị danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "0.   Thoát khỏi chương trình");
            luachonso = a.nextInt();
            a.nextLine();
            if(luachonso==1){
                //1. them sinh vien
                System.out.println("Nhập mã sinh viên: ");
                String maSV=a.nextLine();
                System.out.println("Nhập tên sinh viên: ");
                String ten=a.nextLine();
                System.out.println("Nhập điểm trung bình sinh viên: ");
                float diemtb =a.nextFloat();
                SinhVien sv = new SinhVien(maSV,ten,diemtb);
                functionHandle.themSinhVien(sv);// them sv
            }
            else if (luachonso==2) {
                //in danh sach
                functionHandle.inDSSinhVien();
            }
            else if (luachonso==3) {
                // kt danh sach rong khong
                System.out.println("Danh sách rỗng: "+functionHandle.kiemtraDSrong());
            }
            else if (luachonso==4) {
                // tong sinh vien
                System.out.println("Số lượng hiện tại: "+ functionHandle.tongSinyhVien());
            }
            else if (luachonso==5) {
                // xoa tat ca sinh vien
                functionHandle.xoaAllSInhVien();
            }
            else if (luachonso==6) {
                // kiem tra sinh vien ton tai ko theo ma
                System.out.println("Nhập mã sinh viên: ");
                String maSinhVien = a.nextLine();
                SinhVien sv=new SinhVien(maSinhVien);
                //System.out.println("Sinh vien ton tai hay ko: "+functionHandle.kiemtratontaiSV1(sv));// cach 1
                //System.out.println("Sinh vien ton tai hay ko: "+functionHandle.kiemtratontaiSV(maSinhVien)); // cach 2
                System.out.println("Sinh vien ton tai hay ko: "+functionHandle.kiemtratontaiSV(sv)); //cách 3
            }
            else if (luachonso==7) {
                // xoa 1 sinh vien
                System.out.println("Nhập mã sinh viên: ");
                String maSinhVien = a.nextLine();
                //SinhVien sv=new SinhVien(maSinhVien);
                System.out.println("Xóa sinh viên trong danh sách: " + functionHandle.xoa1SinhVien(maSinhVien));
            }
            else if (luachonso==8) {
                // tim ten sinh vien theo tu khoa nhap vao
                System.out.println("Nhập tên sinh viên: ");
                String ten=a.nextLine();
                System.out.println("Kết quả : ");
                functionHandle.searchSV_ten(ten);
            }
            else if(luachonso==9) {
                // săp xep diem giam dan
                functionHandle.sapXepSVDiemGiamDan();
                functionHandle.inDSSinhVien();
            }


        }while (luachonso !=0) ;// trong () dung thi chay tiep sai thi dung thoi
        // minh lau roi ko dung do....while nên giờ dùng lại

    }
}
