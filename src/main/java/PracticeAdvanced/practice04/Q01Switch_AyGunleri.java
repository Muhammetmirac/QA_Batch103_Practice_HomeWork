package PracticeAdvanced.practice04;

import java.util.Scanner;

public class Q01Switch_AyGunleri {
    public static void main(String[] args) {
         /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

                                                                                                        */

    Scanner input = new Scanner(System.in);
        System.out.println("yılı giriniz");
        int yil = input.nextInt();
        System.out.println("ay no giriniz");
        int ay =input.nextInt();

        int gun;

        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                gun=31;
                System.out.println("girdiğiniz ayın gün sayısı :" +gun);
                break;
            case 4: case 6: case 9: case 11:
                gun=30;
                System.out.println("girdiğiniz ayın gün sayısı :" +gun);
                break;
            case 2:
                if ((yil%4==0 && yil%100!=0) || yil%400==0 ){
                    gun = 28;

                    System.out.println("girdiğiniz ayın gün sayısı :" +gun);
                    break;
                }else {
                    gun=28;
                    System.out.println("girdiğiniz ayın gün sayısı :" +gun);
                }break;

            default:
                System.out.println("gecerli bir ay numarası giriniz");
        }













    }
}
