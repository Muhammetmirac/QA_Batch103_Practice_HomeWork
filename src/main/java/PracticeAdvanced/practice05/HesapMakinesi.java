package PracticeAdvanced.practice05;

public class HesapMakinesi {
    public void toplama(int... a) {
        int toplam = 0;
        for (int w : a) {
            toplam += w;
        }
        System.out.println("toplam = " + toplam);
    }

    public void cikarma(int a, int b) {
        System.out.println("fark = " + (a - b));
    }

    public void carpma(int... a) {
        int carpma = 1;
        for (int w : a) {
            carpma *= w;
        }
        System.out.println("carpma = " + carpma);
    }

    public void bolme(int a, int b) {
        if (b == 0) {
            System.out.println("Bolen sayı '0' olamaz");
        } else {
            System.out.println(a / b);
        }
    }
}
