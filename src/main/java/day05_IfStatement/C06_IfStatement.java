package day05_IfStatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {


   //     Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
        boolean sayiAraligi = sayi<999 && sayi<10000;

        System.out.println( sayi>999 && sayi<10000 ?
                (sayi%5==0 ?
                        (sayi%10==0 ? "5’e bölünen çift sayı": "5’e bölünen tek sayı") :    "Tekrar deneyin"):
        "4 basamaklı bir sayı giriniz");




      //2. yol if else ile
        Scanner input = new Scanner(System.in);
        System.out.println( " Lutfen 4 basamakli bir sayi giriniz...");
        int sayi1= input.nextInt();


        if( sayi1<1000 || sayi1> 9999){ //istenmeyen durum incelendi
            System.out.println( " Lutfen 4 basamakli pozitif bir sayi giriniz");

        }else if(sayi1%5 ==0){// 4 basamakli ve 5 'e tam bolunuyor
            if( sayi1%10 ==0){//4 basamkli 5 ile bolunebilen son rak=0
                System.out.println("5'e bolunebilen cift sayi...");
            }else{
                System.out.println("5'e bolunebilen tek sayi...");
            }

        }else {//4 basamakli 5 'e bolunemiyor
            System.out.println( "Tekrar deneyin");
        }
    }
}
