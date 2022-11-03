package PracticeAdvanced.practice06;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Q01_RastgeleSayimMatriksi {
    /*

Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayınızı giriniz");
        int sayi = scan.nextInt();

        for (int i = 0; i < sayi; i++) {

            for (int j = 0; j < sayi; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }


    }
}
