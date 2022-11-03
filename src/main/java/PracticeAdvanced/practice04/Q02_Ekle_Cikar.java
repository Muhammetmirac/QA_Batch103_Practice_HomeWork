package PracticeAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_Ekle_Cikar {
    public static void main(String[] args) {
        /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
                                                                                                                      */
        Scanner scan = new Scanner(System.in);


        List<Integer>list = new ArrayList<>();

        while(true){
            System.out.println("Ekleme yapmak için 'add'\n +" +
                    "Guncelleme yapmak için 'update'\n" +
                    "Silmek için 'delete'\n" +
                    "Çıkmak için'quit' komutunu giriniz.");

            String option = scan.next();
            if (option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediğiniz sayıyı giriniz");
                int eklenecekSayi = scan.nextInt();
                list.add(eklenecekSayi);
            }else if (option.equalsIgnoreCase("update")){
                System.out.println("Guncellemek istediğiniz sayıyı giriniz");
                int guncellenecekSayi = scan.nextInt();
                System.out.println("Girmek istediğiniz yeni sayıyı giriniz");
                int yeniSayi=scan.nextInt();
                list.set(list.indexOf(guncellenecekSayi),yeniSayi);

            }else if (option.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediğiniz sayıyı giriniz");
                int silinecekSayi =scan.nextInt();
                //list.remove(silinecekSayi) olarak girdiğimizde girilen değer int oldugu için index kabul edecekti
                list.remove((Integer)silinecekSayi);//wrapper işlemi ile artık obje olarak kabul eder. yoksa index olarak kabul ederdi.
            }else if (option.equalsIgnoreCase("quit")){
                break;
            }else{
                System.out.println("Geçerli bir giriş parametresi yazınız");
            }
            System.out.println(list);
        }
        System.out.println("iyi tıkladın valla");














    }
}
