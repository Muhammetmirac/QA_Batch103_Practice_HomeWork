package PracticeAdvanced.practice06;

public class Kitap {
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int toplamKitapSayisi;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        toplamKitapSayisi++;
        seriNo = yazarAdi.substring(0,2)+kitapAdi.substring(0,2)+toplamKitapSayisi;
    }
public void kitapBilgi(){
    System.out.println("Kitap Adı : "+kitapAdi+"\nYazar Adı : "+yazarAdi +"\nSayfa Sayısı : "+sayfaSayisi+"\nSeri NO : "+seriNo);
    System.out.println("***");
}

}
