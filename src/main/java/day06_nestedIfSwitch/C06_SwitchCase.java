package day06_nestedIfSwitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //girilen pozitif 3 basamakı bir sayıyı yazı ile yazdırın
        //568
        //besyuzaltmıssekiz

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı bir rakam giriniz");
        int s = scan.nextInt();
        if (s > 99 && s < 1000) {
            int birler = s % 10;
            int onlar = s / 10 % 10;
            int yuzler = s / 100 % 10;

            switch (yuzler) {
                case 1:
                    System.out.print("Yuz ");
                    break;
                case 2:
                    System.out.print("iki yüz ");
                    break;
                case 3:
                    System.out.print("Uc yuz ");
                    break;
                case 4:
                    System.out.print("Dort yüz ");
                    break;
                case 5:
                    System.out.print("Bes yuz ");
                    break;
                case 6:
                    System.out.print("Altı yüz ");
                    break;
                case 7:
                    System.out.println("Yedi yuz ");
                    break;
                case 8:
                    System.out.print("Sekiz yüz ");
                    break;
                case 9:
                    System.out.print("Dokuz yuz ");
                    break;

            }
            switch (onlar) {
                case 1:
                    System.out.print(" On ");
                    break;
                case 2:
                    System.out.print(" Yirmi ");
                    break;
                case 3:
                    System.out.print(" Otuz ");
                    break;
                case 4:
                    System.out.print(" Kırk ");
                    break;
                case 5:
                    System.out.print(" Elli ");
                    break;
                case 6:
                    System.out.print(" Altmıs ");
                    break;
                case 7:
                    System.out.print(" Yetmis ");
                    break;
                case 8:
                    System.out.print(" Seksen ");
                    break;
                case 9:
                    System.out.print(" Doksan ");
                    break;


            }

            switch (birler) {
                case 1:
                    System.out.print(" bir");
                    break;
                case 2:
                    System.out.print(" iki");
                    break;
                case 3:
                    System.out.print(" üç");
                    break;
                case 4:
                    System.out.print(" dört");
                    break;
                case 5:
                    System.out.print(" beş");
                    break;
                case 6:
                    System.out.print(" altı");
                    break;
                case 7:
                    System.out.print(" yedi");
                    break;
                case 8:
                    System.out.print(" sekiz");
                    break;
                case 9:
                    System.out.print(" dokuz");
                    break;
                default:
                    System.out.println("Geçerli bir sayı giriniz");

            }
        }else
            System.out.println("3 basamaklı bir sayı giriniz");
    }
}
