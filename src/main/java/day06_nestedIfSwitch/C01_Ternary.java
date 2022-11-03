package day06_nestedIfSwitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sıfırdan buyuk bır tam sayı giriniz");
        int sayi= scan.nextInt();


        System.out.println( sayi>0 ? (sayi>99 && sayi<1000 ? "3 basamaklı" :
                (sayi%2==0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı " ) ): "lutfen sıfırdan buyuk sayı giriniz");

    }
}
