package day02_Variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin Birinci Kenarını Giriniz");
        byte a = scan.nextByte();
        System.out.println("Üçgenin İkinci Kenar Uzunluğunu Giriniz");
        byte b = scan.nextByte();
        System.out.println("Üçgenin Üçüncü Kenarını Giriniz");
        byte c = scan.nextByte();
        System.out.println("Üçgenin Çevresi ="+(a+b+c));
        System.out.println("Üçgenin Alani="+a*b*c);


    }
}
