package day05_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

            //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
            // asagidaki degerlere gore cevap yazdirin.
            //Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
            //10000 – 20.000 arasinda ise "Konusabiliriz",
            //10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Maaş teklifiniz nedir");
        int maas = scan.nextInt();

        if (maas<10000){
            System.out.println("Maalesef Kabul Edemem");
        }else if (maas>=10000&&maas<20000){
            System.out.println("Konusabiliriz");
        }else if (maas>=20000){
            System.out.println("Kabul Ediyorum");
        }
        }
}
