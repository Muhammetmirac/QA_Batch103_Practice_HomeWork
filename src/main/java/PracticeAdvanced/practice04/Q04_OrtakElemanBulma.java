package PracticeAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_OrtakElemanBulma {
    public static void main(String[] args) {
        ///*
        // * İki Array'de ortak bulunan elementleri yazdırınız.
        // * (case sensitivity olmadan)
        //
        // * Input1 : {John,Brad,Angel,Sofia,Emily,ali} Input2 : {sofia,brad,grace,emily,hazel,ALi}
        //
        // * Output : [brad,sofia,emily]
        // */

        String arr[] = {"John","Brad","Angel","Sofia","Emily","ali"} ;
        String brr[] ={"sofia","brad","grace","emily","hazel","Ali"};
        List<String> list = new ArrayList<>();

        for (String w: arr             ) {
            for (String k: brr                 ) {
                if (w.equalsIgnoreCase(k)){
                    list.add(w);

            }
        }

        }
        System.out.println("Ortak elemanlar = "+list);
    }
}
