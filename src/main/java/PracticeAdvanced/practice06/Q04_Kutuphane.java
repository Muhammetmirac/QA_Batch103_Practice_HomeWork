package PracticeAdvanced.practice06;

public class Q04_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı,
    // seri numarası ile yazdıran bir kod yazınız.


    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("Sefiller","Oscar Wild",333);
        kitap1.kitapBilgi();
        Kitap kitap2 = new Kitap("1984","George Orwell",352);
        kitap2.kitapBilgi();
        new Kitap("İnce Memet","Yaşar Kemal",1000).kitapBilgi();

    }
}
