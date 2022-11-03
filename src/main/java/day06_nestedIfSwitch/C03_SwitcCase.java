package day06_nestedIfSwitch;

import java.util.Scanner;

public class C03_SwitcCase {
    public static void main(String[] args) {
        /*DERS PROGRAMI

Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

 Pazartesi ve Sali ise: Java

Persembe ve Cuma ise: Selenyum

Carsamba ve Cumartesi ise: SQL

aksi halde: izin gunu=Day Off

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunu giriniz");
        String gun =scan.nextLine().toLowerCase();

        switch (gun){
            case "pazartesi" :
            case "sali":
                System.out.println("Java");
                break;
            case "carsamba" : case "cumartesi" :
                System.out.println("SQL");
                break;
            case "persembe": case "cuma"   :
                System.out.println("Selenium");
                break;
            case "pazar" :
                System.out.println("izin gunu");
            default:
                System.out.println("gecerli gun giriniz");


        }

    }
}
