package PracticeAdvanced.practice02;

import java.util.Arrays;

public class Q3_For_euroDolarToplami {
    public static void main(String[] args) {
        /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
        String str = "$1 $12 €34 €56 $45 €78";

        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolarToplam = 0;
        int euroToplam = 0;

        for (String w : arr) {
            if (w.contains("$")){
                dolarToplam=dolarToplam + Integer.parseInt(w.replace("$",""));//parseInt metodu valueOf gibi çevirmelerde(String-->int) kullandığımız metoddur.
            }else
                euroToplam=euroToplam+Integer.valueOf(w.replace("€",""));

        }
        System.out.println("euroToplam = " + euroToplam);
        System.out.println("dolarToplam = " + dolarToplam);
    }
}