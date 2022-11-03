package day04_IfStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {


        //Kullanıcıdan bir gun alın eger "cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdırın.
        // Cumartesi ise "Yahudiler için kutsal gün"
        //"Pazar" ise "Hristiyanlar icin kutsal gun" yazdırın

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun =input.next();



        if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler için kutsal gün");
        }else if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }else if (gun.equalsIgnoreCase("Sali")||
                gun.equalsIgnoreCase("Carsamba")||
                gun.equalsIgnoreCase("Persembe")||
                gun.equalsIgnoreCase("Pazartesi")){

            System.out.println("Ortak Gun");
        }else{
            System.out.println("Lutfen geçerli bir gun giriniz");

        }
    }
}
