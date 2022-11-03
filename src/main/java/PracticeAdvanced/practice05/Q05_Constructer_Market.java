package PracticeAdvanced.practice05;

public class Q05_Constructer_Market {
    public static void main(String[] args) {
        //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..


        Market ekmekObjesi = new Market("Ekmek",5,1);

        System.out.println(ekmekObjesi.urunAdi+" "+"Ürün Fiyatı = "+ekmekObjesi.urunFiyati+"Son Kullanma Tarihi = "+ekmekObjesi.sonKullanmaTarihi);
        Market nutellaobjesi = new Market("Nutella",45,12);
        System.out.println(nutellaobjesi.urunAdi+" "+"Ürün Fiyatı = "+nutellaobjesi.urunFiyati+"Son Kullanma Tarihi = "+nutellaobjesi.sonKullanmaTarihi);
        Market hypo = new Market("hypo",15);
        System.out.println(hypo.urunAdi+" "+"Ürün Fiyatı = "+hypo.urunFiyati+" Son Kullanma Tarihi = "+hypo.sonKullanmaTarihi);
    }

}
