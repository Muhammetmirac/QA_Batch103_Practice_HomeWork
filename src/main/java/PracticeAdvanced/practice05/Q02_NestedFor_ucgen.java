package PracticeAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor_ucgen {
    public static void main(String[] args) {
/*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" satır sayısı giriniz");
        int satir =scan.nextInt();
        for (int i = 1; i <6 ; i++) {
            for (int bosluk = satir-i; bosluk >1 ; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <=i ; yildiz++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
