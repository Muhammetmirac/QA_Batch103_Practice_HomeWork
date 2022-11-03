package PracticeAdvanced.practice02;

import java.util.Scanner;

public class Q4_NestedFor_Matrix {
    public static void main(String[] args) {
        /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */


        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi=scan.nextInt();

        int carpim = 1;

        for (int j = 1; j <sayi+1 ; j++) {//satır kontrolu
            for (int i = 1; i < sayi+1; i++) {//sutun kontrolu


                System.out.print(String.format("%02d",j*i)+" ");//String.format rakam basamaklarını 0 ile doldurmasını saglayan metod

            }

            System.out.println();// bir satır aşağı inmek için
        }




        }
    }

