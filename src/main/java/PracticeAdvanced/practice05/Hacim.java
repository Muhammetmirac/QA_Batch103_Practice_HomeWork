package PracticeAdvanced.practice05;

public class Hacim {
    int kenar;
    int kenar2;
    int kenar3;
    double hacim;

    public void hacimHesapla(int kenar) {
        System.out.println("Kupun Hacmi = "+ kenar * kenar * kenar);

    }

    public void hacimHesapla(int kenar, int kenar2) {
        System.out.println("Kare Prizma Hacmi = "+kenar * kenar * kenar2);
    }

    public void hacimHesapla(int kenar, int kenar2, int kenar3) {
        System.out.println("Dikdörtgen Prizmanın Hacmi = "+ kenar * kenar2 * kenar3);

    }
}