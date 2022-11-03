package PracticeAdvanced.practice02;

import java.util.Scanner;

public class Q2_forLoop_continue {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan = new Scanner(System.in);
        int toplam =0;

        for (int i=1; i<6; i++){
            System.out.println("lutfen sayı giriniz");
            int sayi =scan.nextInt();
            if(sayi>5 && sayi<10){
                System.out.println("girdiğiniz rakam 5 ile 10 arasında olduğundan işleme alınmayacaktır");
                continue;
            }
                toplam+=sayi;

        }
        System.out.println(toplam);
    }
}
