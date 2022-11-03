package PracticeAdvanced.practice01;

import java.util.Scanner;

public class Q5_doWhile_TahminOyunu {
    public static void main(String[] args) {

        ///0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.

        Scanner scan = new Scanner(System.in);
        int rakam;
        int tahmin1 = 58;
        int tahmin= (int)(Math.random()*100)+1;// random metodu 0 ile 1 (1 hariç)arasında bir deger verir bu yuzden 100 ile çarparız
        System.out.println("tahmin = " + tahmin);
        int counter=0;

        System.out.println("tahmin oyunu için 0-100 arası bir rakam giriniz");
        System.out.println("5 hakkınız var");

        do {

            rakam = scan.nextInt();

            counter++;

            if (rakam == tahmin) {
                System.out.println("tebrikler kazandınız");
            } else if (rakam > tahmin) {
                System.out.println("Daha küçük bir numara giriniz.");

            } else if (tahmin > rakam){
                System.out.println(" Daha büyük bir numara giriniz.");

        }
        if (counter==5){
            System.out.println("Üzgünüm hakkınız kalmadı\nTekrar oynamak için 1, ıkmak için herhangi bir sayı girin");
            int secenek =scan.nextInt();
            if(secenek ==1){
                counter =0;
                tahmin= (int)(Math.random()*100)+1;
            }else break;
        }



        }while(rakam!=tahmin );




















    }
}
