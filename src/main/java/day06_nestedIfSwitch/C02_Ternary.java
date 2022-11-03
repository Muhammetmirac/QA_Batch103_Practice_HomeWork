package day06_nestedIfSwitch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

/*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        String finalNotu= scan.next().toLowerCase();


        System.out.println((finalNotu.equalsIgnoreCase("A")) ? "Çok Başarılı" :
                            (finalNotu.equalsIgnoreCase("B") ? "Başarılı" :
                            (finalNotu.equalsIgnoreCase("C") ? "orta" : "Diğerleri" )));
    }
}
