package PracticeAdvanced.practice07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q02_UzunKelime {

    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
                                                                                                            */


        System.out.println(uzunKelimeBulma());


    }

    public static List<String> uzunKelimeBulma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle girin");
        String cumle = scan.nextLine();
        List<String> list= List.of(cumle.split(" "));

        int max=0;

        for (String w:list){
            if(w.length()>max){
                max=w.length();
            }
        }
        List<String> enUzunKelime=new ArrayList<>();
        for (String w:list     ) {
            if (w.length()==max){
                enUzunKelime.add(w);
            }
        }
    return enUzunKelime;
    }
}
