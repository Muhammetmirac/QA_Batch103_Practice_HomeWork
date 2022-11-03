package day06_nestedIfSwitch;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi :1\nSali :2\nCarsamba :3\nPersembe :4\nCuma :5\nCumartesi :6\nPazar :7\n Haftanın kaçıncı gününde olduğunuzu giriniz");
        int gun = scan.nextInt();

        if (gun>7 || gun<0){
            System.out.println("Hatalı veri girişi");

        }else{
            System.out.println("Kaç gün sonrasını bilmek istiyorsunuz");
            int kacGunSonra = scan.nextInt();
            int bulunanGun =(kacGunSonra+gun)%7;

            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonra +" gun sonra gunlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonra +" gun sonra gunlerden salı");
                    break;
                case 3:
                    System.out.println(kacGunSonra +" gun sonra gunlerden carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonra +" gun sonra gunlerden persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonra +" gun sonra gunlerden cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonra +" gun sonra gunlerden cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonra +" gun sonra gunlerden pazar");
                    break;
                default:
                    System.out.println(kacGunSonra +" gecerli deger giriniz");
            }

        }



    }
}
