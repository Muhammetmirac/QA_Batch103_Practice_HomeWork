package day02_Variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

     /*  // Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli sayi giriiniz");
        int sayi = scan.nextInt();
        int ilkRakam=sayi%10;
        int sonRakam=sayi/1000;

        System.out.println("1. ve 4. basamak toplamı="+(ilkRakam+sonRakam));

      */

       // Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak
        // yazdirin

        Scanner scan2=new Scanner(System.in);
        System.out.println("3 basamakli  bir sayi giriniz");
        int sayi2 =scan2.nextInt();

        int birler = sayi2%10;
        int onlarıbulmakicin = sayi2/10;
        int onlar = onlarıbulmakicin%10;
        int yuzler = sayi2/100;
        System.out.println("birler ="+birler);
        System.out.println("onlar ="+onlar);
        System.out.println("yuzler = " + yuzler);


        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //        //         *   Ex :
        //        //         *   input  : 12345==>1+2+4+5=12
        //        //         *   output : 12


    }
}
