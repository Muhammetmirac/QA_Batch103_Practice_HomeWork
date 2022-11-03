package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStatement {
    public static void main(String[] args) {

        //Kullanıcıdan alacağınız iki sayıyı yıne kullanıcıya sectıreceginiz
        // dort işlemden biri ie işleme koyup sonucu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen\n toplama işlemi için 1\n çikarma işlemi için 2\n bolme islemi için 3\n çarpma işlemi için 4");
        double islem=scan.nextInt();
        System.out.println("Lütfen iki tamsayı giriniz");
        double x= scan.nextInt();
        double y=scan.nextInt();
        double toplama =x+y;
        double çıkarma=(x-y);
        double bolme= x/y;
        double çarpma=x*y;

        if(islem==1){
            System.out.println("toplama = " + toplama);
        }else if(islem==2){
            System.out.println("çıkarma = " + çıkarma);
        } else if (islem == 3) {
            System.out.println("bolme ="+ bolme);
        }else if(islem==4){
            System.out.println("çarpma = " + çarpma);
        }else{
            System.out.println("hatalı giriş yaptınız");
        }

    }
}
