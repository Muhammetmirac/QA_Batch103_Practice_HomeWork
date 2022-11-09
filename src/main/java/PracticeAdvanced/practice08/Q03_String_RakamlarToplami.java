package PracticeAdvanced.practice08;

import java.util.Scanner;

public class Q03_String_RakamlarToplami {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
                                                                                                            */
    static String str = "";
    static int strToplam=0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        str = scan.nextLine();


        rakamlarToplam(str);

    }

    static void rakamlarToplami2(String str){//2. yol soruda istenen methodlarla

        int toplam =0;
        for(int i=0; i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                toplam += Integer.parseInt(""+str.charAt(i));

            }
        }
        System.out.println("Rakamlar toplami: "+toplam);
    }

    static void rakamlarToplam(String str) {
        str = str.replaceAll("\\D", "");
        System.out.println(str);
        for (int i = 0; i <str.length() ; i++) {
            strToplam+= Integer.parseInt(""+str.charAt(i));

        }
        System.out.println("Rakamlar Toplamı = "+strToplam);
    }
}
