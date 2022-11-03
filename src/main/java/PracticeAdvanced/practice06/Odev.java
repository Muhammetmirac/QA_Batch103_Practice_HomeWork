package PracticeAdvanced.practice06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev {
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









    }

}
