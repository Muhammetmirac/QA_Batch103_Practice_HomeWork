package PracticeAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk karakteri giriniz");
        char ch1 = scan.next().charAt(0);
        System.out.println("İkinci karakteri giriniz");
        char ch2 = scan.next().charAt(0);

        //1.yol

        int ilk=Math.min(ch1,ch2);
        int ikinci=Math.max(ch1,ch2);
        for (int i = ilk; i <ikinci ; i++) {
            System.out.print("" +(char) i+" ");
        }
        System.out.println();
        //2.yol if else ile
        if (ch1 < ch2) {
            for (int i = ch1; i <= ch2; i++) {
                System.out.print("" +(char) i+" ");
            }
        }else{
                for (int i = ch2; i <= ch1; i++) {
                    System.out.print("" +(char) i+" ");
                }
        }
    }
}