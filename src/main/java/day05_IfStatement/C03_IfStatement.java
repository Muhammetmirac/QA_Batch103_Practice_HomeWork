package day05_IfStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz"+"\n erkek"+"\n kadın");
        String cinsiyet = scan.next();
        System.out.println("Yasınızı giriniz");
        int yas = scan.nextInt();


       if (yas>0 && yas<120){
           if (cinsiyet.equalsIgnoreCase("erkek")) {
               if (yas >=65) {
                   System.out.println("emekli olabilir");
               } else {
                   System.out.println("emekli olamaz");
                   System.out.println(65-yas+" sene daha çalışmalısın..");
               }

           }else if(cinsiyet.equalsIgnoreCase("kadin")){
               if (yas >= 60) {
                   System.out.println("emekli olabilir");
               } else {
                   System.out.println("emekli olamaz");
                   System.out.println(60-yas +" sene daha çalışmalısın");
               }

           }else {
               System.out.println("cinsiyet veya yasi hatali girdiniz");
           }
       }else
        System.out.println("Yasınızı dogru giriniz");

    }
}
