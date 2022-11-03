package day07_stringManipulation;

public class C04_StarthWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle = "Kazananlar hiç hata yapmayanlar degil, vazgecenlerdir";
        //ka ile başlıyor mu

        System.out.println(cumle.startsWith("Ka"));

        //dir ile bitiyor mu
        System.out.println(cumle.endsWith("dir"));
    }
}
