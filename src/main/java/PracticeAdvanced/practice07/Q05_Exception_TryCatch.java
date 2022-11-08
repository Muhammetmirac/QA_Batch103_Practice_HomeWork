package PracticeAdvanced.practice07;

import java.util.Random;

public class Q05_Exception_TryCatch {
    public static void main(String[] args) throws Exception {

        /*

   randomSayi isminde bir method oluşturunuz.

   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)

   Bu iki random sayının toplamını yazdırın.

   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak

   ("Sayı 12'den küçük ise hata verir") yazdırın.
                                                                                                                    */

        randomSayi();

    }


    public static void randomSayi() {
        Random random = new Random();// RAndom Classı rastgele sayı alabilmemiz için

        while (true) {
            int a = random.nextInt(11);//bound her zaman üsst sınırdır.
            int b = random.nextInt(11);
            int toplam = a + b;

            try {
                if (toplam < 12) {
                    throw new Exception();
                } else {
                    System.out.println(a + "--" + b);
                    System.out.println("toplam = " + toplam);
                    break;
                }
            } catch (Exception e) {
                System.out.println("toplam = " + toplam);
                System.out.println("\"Sayı 12'den küçük ise hata verir\"");
            }
        }
    }
}