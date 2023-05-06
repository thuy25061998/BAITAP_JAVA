package BAITAP01;

import java.time.LocalDateTime;

public class SinhVien {

    public String ten;
    public static int namSinh;
    public String diaChi;

    public void inTenSinhVien(String ten){
        System.out.println("Ten sinh vien: " + (this.ten = ten));
    }

    public static void inTuoi(int namSinh){
        LocalDateTime localDate = LocalDateTime.now();
        int tuoi = localDate.getYear() - namSinh;
        System.out.println("Nam sinh: "+ tuoi);
    }

    public void inDiaChi(String diaChi){
        System.out.println("Dia chi: "+ (this.diaChi = diaChi));
    }

    public void main(String[] args){
        SinhVien sv = new SinhVien();
        sv.inTenSinhVien("Thuy");
        sv.inTuoi(1998);
        sv.inDiaChi("TP HCM");

        System.out.println("Nganh hoc: " + ThongTin.nganh);
        System.out.println("Truong: " + ThongTin.truong);
    }


}
