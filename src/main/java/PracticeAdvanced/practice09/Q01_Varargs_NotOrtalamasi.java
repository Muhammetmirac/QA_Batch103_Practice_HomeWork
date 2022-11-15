package PracticeAdvanced.practice09;

public class Q01_Varargs_NotOrtalamasi {

    public static void main(String[] args) {
        //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.

        notOrtalamaHesapla("Ali",80,90,75,77,50,60);
        notOrtalamaHesapla("Veli",100,20,75,81.5);
        notOrtalamaHesapla("Musa",77,45,22);
        notOrtalamaHesapla("cemal",100,99.9,100,98,97);
    }

    public static void notOrtalamaHesapla(String isim,double...a){
        double sum=0;
        for (double w : a    ) {
           sum+=w;

        }

        System.out.println(isim + "'nin not ortalaması : "+String.format("%.2f",sum/a.length));
    }
}
