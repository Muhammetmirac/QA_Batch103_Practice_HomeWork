package day04_IfStatement;

import java.util.Scanner;

public class C02_IfStatement02
{
    public static void main(String[] args) {
         /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
      Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");
        byte not=scan.nextByte();

        if (not>90 && not<=100){
            System.out.println("A--Çok İyİ");
        }else if (not>80 && not<=90){
            System.out.println("B--İyi");
        }else if (not>70 && not<=80){
            System.out.println("C--Orta");
        }else if (not>=60 && not<=70){
            System.out.println("D--Gecer");
        }else if (not>0 && not<60){
            System.out.println("F--Zayıf");
        }else{
            System.out.println("Lutfen gecerli bir not giriniz");
        }










    }
}
