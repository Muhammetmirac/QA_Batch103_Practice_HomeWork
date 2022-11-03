package day07_stringManipulation;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class C06_Length {
    public static void main(String[] args) {
        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle = "Bugun hava yagmurlu";
        String str1 = "";
        System.out.println(str1.length());//0
        String str2 = " ";
        System.out.println(str2.length());//1


        //kullanıcıdan isim ve soyismini girmesini isteyin hangisinin daha uzun olduğunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("isim ve soy isminizi giriiniz");
        String ad = scan.next();
        String soyad = scan.next();

        System.out.println(ad.length()==soyad.length() ? "isminiz ve soyisminiz eşit" : ad.length()>soyad.length() ? ad+" isminiz soyisminizden daha uzun" : soyad+"soyadınız isminizden daha uzun");








    }





}
