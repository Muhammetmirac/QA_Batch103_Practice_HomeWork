package day05_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double x = scan.nextDouble();
        double y = scan.nextDouble();


        System.out.println(x==y ?"Sayılar eşit":(x>y ? x :y));
    }
}
