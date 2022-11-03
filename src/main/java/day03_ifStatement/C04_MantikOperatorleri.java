package day03_ifStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {
        // "||"==> "veya"
        //  "&&"==> "ve"

        /*
        && ile & arasındaki fark
           // && de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calismaz
    // Ancak & tum satırı kontrol eder ondan sonra durur.
    // sonucta fark yok sadece biri ilk hatayı buldugunda durur digeri sonuna kadar gider. && tekliye göre daha hızlı calısır.
         */

        System.out.println(5 + 2 == 8);//false

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;//true
        System.out.println("sonuc1= "+sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println("sonuc2 = "+sonuc2);//false  ==>  false bulduğu an ileri gitmez ve hemen yazdırır.
                                                        // bu şekilde daha hızlıdır

        int sayi1 =15;
        //sayi1 in 10 ile 20 aralığında olduğunu true diyerek dondurelim
        //java üçlü karşılaştırma yapmaz
        //ikili karşılaştırmalar yaparak mantıksal operatorler ile birleştirmeliyiz

        System.out.println(10<sayi1&&sayi1<20);

        int sayi2 = 5;
        //sayi2 nini 10 ile 20 arasında olmadığını gösteren kod yazınız
        System.out.println(sayi2<10 || sayi2<20);

    }

}
