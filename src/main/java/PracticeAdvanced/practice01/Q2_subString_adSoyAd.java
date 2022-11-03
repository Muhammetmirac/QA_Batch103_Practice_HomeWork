package PracticeAdvanced.practice01;

import java.util.Scanner;

public class Q2_subString_adSoyAd {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String str = scan.nextLine();

        String ad =str.substring(0,str.indexOf(" "));
        String soyad=str.substring(str.indexOf(" ")+1);// +1 boşluktan sonraki karakterden başlaması için
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}