package PracticeAdvanced.practice05;

public class Q04_Varargs_HesapMakinasi {
    //Temel 4 matematik işlemi yapan bir kod yazınız.
    public static void main(String[] args) {
        HesapMakinesi hesap = new HesapMakinesi();
        hesap.bolme(15,3);
        hesap.carpma(3,5,7,8,10);
        hesap.cikarma(9574,4512);
        hesap.toplama(1,2,3,4,5,6,7,8,9,10,11,12);


    }
}
