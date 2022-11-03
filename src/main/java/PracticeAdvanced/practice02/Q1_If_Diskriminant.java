package PracticeAdvanced.practice02;

import java.util.Scanner;

public class Q1_If_Diskriminant {
    public static void main(String[] args) {
        /* Günün sorusu: if statement
      katsayıları verilen 1 bilinmeyenli denklemin köklerini bulunuz.
        ax^2 + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formulü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen denklemin a, b ve c sayılarını sırayla giriniz");
        double a =input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double delta = b*b-4*a*c;

        if (delta>0){
         double x1 = (-b + Math.sqrt(delta))/(2*a);
         double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("denklemin iki kökü vardır"+"\nx1= "+x1 +"\nx2= "+x2);
        }else if(delta==0                      ){
            double x =-b/(2*a);
            System.out.println("denklemin bir kökü vardır"+"\nx= "+x);
        }else
            System.out.println("denklemin koku yoktur");



    }
}
