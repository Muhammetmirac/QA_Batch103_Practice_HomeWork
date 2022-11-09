package PracticeAdvanced.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_Gunluk_Gelir {
    /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
                                                                                            */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Çarsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gelirini giriniz");
            double gununGeliri = scan.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }
        System.out.println(gunlukGelirler);
        System.out.println("Haftalik Toplam Gelir = "+toplamGelir);
        System.out.println("Haftalık Ortalama = " + haftalikOrtalama());
        System.out.println("ortalamaUstuGunler = " + ortalamaUstuGunler());
        System.out.println("ortalamaAltiGunler = " + ortalamaAltiGunler());
    }


    public static double haftalikOrtalama() {

        return toplamGelir / gunler.size();
    }

    public static String ortalamaUstuGunler() {
        String str ="";
        for (int i = 0; i <gunlukGelirler.size() ; i++) {
            if (gunlukGelirler.get(i)>haftalikOrtalama()){
                str+=gunler.get(i)+" ";
            }

        }
return str;
    }

    public static String ortalamaAltiGunler() {
        String str ="";
        for (int i = 0; i <gunlukGelirler.size() ; i++) {
            if (gunlukGelirler.get(i)<haftalikOrtalama()){
                str+=gunler.get(i)+" ";
            }

        }
        return str;
    }
}
