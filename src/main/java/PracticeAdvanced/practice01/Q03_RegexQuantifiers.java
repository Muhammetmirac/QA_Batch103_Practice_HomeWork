package PracticeAdvanced.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "as";
        System.out.println(str.matches(".s"));//boolean sonuc verir eşleşiyor mu eşleşmiyor mu sorusuna cevap verir
                                                    //.s ifadesi iki karakterden ve sonunda s ile mi bitiyor sorusuna cevap almak içindir
                                                    //kac karakterli ise o kadar nokta eklememiz lazım yoksa false verir




        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
        String str2 = "asa mmusada mı";
        System.out.println(str2.matches(".s.*"));// ilk karakter herhangi bir char ile ve 2. ise s olacak daha sonra
                                                        // '.' ve '*' konuldugunda kaç karakterli olsada nokta koymaya gerek kalmaz
        System.out.println("&asdlf".matches(".r.*"));// false ====> ikinci karakter uyuşmadıgından




        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.

        System.out.println("abc".matches("\\w*"));// yıldızlı olursa karakter sayısı onemli olmaz
                                                        // //w{2} seklinde yazarsa 2 karakterli ise
                                                        //[a-zA-Z] şeklinde de sorgulatılabilir



        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("aBhdk".matches("[a-zA-Z]{5}"));// curly braces içerisindeki deger kac karakter içerdiğini sorgulatır
        System.out.println("1234asda".matches("[a-zA-Z]{5}"));//false verir
        System.out.println("1234asda".matches("[a-zA-Z0-9]{8}"));//true verir



        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1234567".matches("\\d{6,}"));//true   // \d{6,} 6 nın yanındaki virgül en az 6 anlamı veriyor
        System.out.println("123456a".matches("\\d{6,}"));//false ===> rakam dısında harf te içerdigi için


        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123".matches("\\w{7,10}"));//true==> curlu braces içerisi enaz ve enfazla karakter aralığıdır



        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,
        System.out.println("1?1265485".matches("[1][\\p{Punct}][0-9]*")); //true
        System.out.println("1?.,,.1265485".matches("[1][\\p{Punct}]{5}[0-9]*")); //true==> punct yanındaki {5} kaç tane noktalama işareti içereceğini sorgular
        System.out.println("1?12654850".matches("[1][\\p{Punct}][0-9]{8}")); //true==>



























    }
}
