package day07_stringManipulation;

import java.util.Scanner;

public class C05_IsEmpty {
    public static void main(String[] args) {
        String str1 = "Hi";
        System.out.println(str1.isEmpty());// false


        String str2 = "";
        System.out.println(str2.isEmpty());//true


        String str3 = " ";
        System.out.println(str3.isEmpty());// false boslugun javada karsılıgı vardır


        //kullanıcıdan alacagıunız bir stringde bosluk karakterinin olup olmadıgını kontrol ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("bana birşey verde kontrol edeyim");
        String str4 = scan.next();

        if (str4.isEmpty()) {
            System.out.println("Boşluk var");
        } else {
            System.out.println("Boşluk yok");

        }
    }
}