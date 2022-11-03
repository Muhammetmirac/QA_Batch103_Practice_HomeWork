package day03_ifStatement;

import java.util.Scanner;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {
        char harf='a';
        char harf2='A';
        System.out.println("harf>harf2==>"+(harf>harf2));

        //NOTE: karşılaştırma işlemlerinin sonucunu true ya da false döner(boolean yani)

        //herhangi bir chae variable in ASCİİ değerini kod yazarak bulun

        //1.yol
        char m ='m';
        System.out.println("m' nin ascii değeri = " + (m+0));
        char space=' ';
        System.out.println("Space in ASCİİ degeri ="+(space+0));
        //NOte : space in ascii değerini bulmak için toplamaya etkisi olmayan "0" ile toplarız.

        //2.yol
            int harf3='m';
        System.out.println("'m' nin ASCII degeri : "+harf3);//109

        //NOTE: charların hem resim hem ASCII sayısal deger oldugu için


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf4 = scan.next();

        System.out.println("HARFİN ASCİİ DEGERİ =" +harf4);

    }
}

