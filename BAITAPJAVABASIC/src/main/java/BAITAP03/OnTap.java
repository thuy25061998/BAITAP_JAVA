package BAITAP03;

import java.util.Scanner;

public class OnTap {

    public int number = 100;
    public void soSanh()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int n = scanner.nextInt();
        if (n == number)
            System.out.println("So vua nhap bang 100");
        else if ( n > number)
            System.out.println("So vua nhap lon hon 100");
        else
            System.out.println("So vua nhao nho hon 100");
    }

    public void main(String[] args){
        int a = 0;
        int b = 2;
        int c = 10;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println((a < b ) || (c < b));
        System.out.println((a < b ) && (c < b));
        System.out.println(a != b);

        soSanh();
    }
}
