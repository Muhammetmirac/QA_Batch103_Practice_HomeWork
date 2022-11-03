package PracticeAdvanced.practice05;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunismi, double fiyat, int aySonra) {
        this.urunAdi = urunismi;
        urunFiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    Market(String urunismi, double fiyat) {
        this.urunAdi = urunismi;
        urunFiyati = fiyat;
        sonKullanmaTarihi = "Açıldıktan sonra 1 yıldır";
    }
}