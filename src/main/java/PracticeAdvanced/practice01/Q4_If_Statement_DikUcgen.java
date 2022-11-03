package PracticeAdvanced.practice01;

import java.util.Scanner;

public class Q4_If_Statement_DikUcgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin x kenar uzunlugunu giriniz");
        int x= scan.nextInt();
        System.out.println("üçgenin y kenar uzunlugunu giriniz");
        int y= scan.nextInt();
        System.out.println("üçgenin z kenar uzunlugunu giriniz");
        int z= scan.nextInt();


        if (x*x==y*y+z*z || y*y==x*x+z*z || z*z==x*x+y*y){
            System.out.println("dik üçgendir");
        }else
            System.out.println("dik üçgen değildir");









































    }
}
