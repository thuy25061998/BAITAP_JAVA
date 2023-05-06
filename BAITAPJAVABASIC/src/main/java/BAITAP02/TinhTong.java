package BAITAP02;

public class TinhTong {

    public static int tongSoNguyen(int a, int b)
    {
        return (a+b);
    }
    public static double tichSoThuc(float a, float b){
        return  (a*b);
    }

    public static void main(String[] args) {
        System.out.println("Tong hai so nguyen: " + tongSoNguyen(10,20));
        System.out.println("Tich hai so thuc: " + tichSoThuc(15.5F,10F));
    }

}
