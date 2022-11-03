package day07_stringManipulation;

public class C01_Concat {
    public static void main(String[] args) {
        /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */



            System.out.println(15 + 20 + "Merhaba");
            System.out.println("Merhaba" + 15 + 20);
            System.out.println("Merhaba" + (15 + 20));
            System.out.println("Merhaba" + 15 * 20);

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.

        String ad = "Muhammet";// scanner ile kullanıcıdan da alınabilir
        String soyAd= "ÜSTÜNDAĞ";
        String tamIsim= ad.concat(" " +soyAd).toUpperCase();
        System.out.println(tamIsim);



    }
}
