package PracticeAdvanced.practice06;

import java.util.Scanner;

public class Odev_Gun_Bulma {
    // Kullanıcıdan aldığınız güne göre o günden kaç gün sonrasının hangi güne denk geldiğini yazdıran bir kod yazınız.
// pazartesi hafta başlangıcı
    public static void main(String[] args) {
        String arr[] = {"Pazartesi","Salı","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi günden başlamak istersiniz : \nPazartesi \nSalı \nÇarşamba \nPerşembe \nCuma \nCumartesi \nPazar");
        String hangiGun= scan.next();
        System.out.println("Kaç gün sonrasını öğrenmek isterseniz");
        int kacGunSonra = scan.nextInt();
        int istenenGun= kacGunSonra%7;
        String sonuc = "";
        for (int i = 0; i<arr.length;i++) {
            if (hangiGun.equalsIgnoreCase(arr[i])){
                 sonuc = arr[i+istenenGun];
            }

        }
        System.out.println(sonuc);
        System.out.println(hangiGun+" gününden "+kacGunSonra+" gün sonraki gün : "+sonuc+" günüdür.");









    }

}
