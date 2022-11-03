package day04_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger girin Y/N");
        char deger = scan.next().charAt(0);

        if (deger == 'Y'|| deger =='y'){
            System.out.println("YES");
        }else if(deger =='N' || deger =='n'){
            System.out.println("NO");
        }else{
            System.out.println("Lutfen 'Y' veya 'N' ikilisinden birini giriniz");
        }
    }
}
