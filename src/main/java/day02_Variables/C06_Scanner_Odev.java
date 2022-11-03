package day02_Variables;

import java.util.Scanner;

public class C06_Scanner_Odev {
    public static void main(String[] args) {
        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz");
        int sayi = input.nextInt();

        int birler =sayi%10;
        int onlar =(sayi/10)%10;
        int binler =(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;

        System.out.println("birler = " + birler);
        System.out.println("onnlar = " + onlar);
        System.out.println("binler = " + binler);
        System.out.println("onbinler = " +onbinler);
        System.out.println("SONUÇ = " + (binler+onlar+binler+onbinler));
    }
}
