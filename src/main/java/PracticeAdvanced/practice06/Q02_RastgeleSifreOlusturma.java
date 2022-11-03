package PracticeAdvanced.practice06;

import java.util.Random;
import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Şifeninizin uzunluğunu giriniz");
         int karakterSayisi=scan.nextInt();
         String sifre = "";
         int sayac=0;

         String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
       // System.out.println(karakterler.length());//62
        int maxIndex = karakterler.length();

        while (sayac<karakterSayisi){

            int rastgeleIndex =(int)(Math.random()*maxIndex);
            sifre+=karakterler.charAt(rastgeleIndex);

            sayac++;
        }
        System.out.println("Şifre = " + sifre);

    }
}
