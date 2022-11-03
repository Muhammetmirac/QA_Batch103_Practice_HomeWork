package day05_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("bana iki sayı girin");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1>0 && sayi2>0){
            System.out.println((sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println(sayi1-sayi2);
        }else if (sayi1> 0 && sayi2<0 || sayi1<0 && sayi2>0){//veya sayi1*sayi2<0 kodu da aynı sonucu verir
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }else if(sayi1==0||sayi2==0){
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
