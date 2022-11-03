package PracticeAdvanced.practice06.Q05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q05_Inheritance_HacimHesaplama {
    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)
    public static void main(String[] args) {
        Kup kup = new Kup();
        double kupHacmi = kup.hacimHesapla(5,6);
        System.out.println("kupHacmi = " + kupHacmi);
        Silindir silindir = new Silindir();
       double silindirHacmi = silindir.hacimHesapla(8,7);
        System.out.println("silindirHacmi = " + silindirHacmi);
        Koni koni = new Koni();
        System.out.println("KoniHacmi : "+ koni.hacimHesapla(6, 9));
        NumberFormat obj = new DecimalFormat(".00");
        System.out.println(obj.format(silindirHacmi));
        System.out.println("Koni.hacimHesapla() = " + obj.format(koni.hacimHesapla(6, 9)));
    }

}
