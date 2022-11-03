package PracticeAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenayt_To_Celsius {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9


        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenayt değeri giriniz");
        double f = scan.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println(c);

        NumberFormat numberFormat = new DecimalFormat(",00");// virgulden sonra kac basamak yazdıracagımızı belirtiyoruz

        String formatC= numberFormat.format(c);
        System.out.println(formatC+1);
        double doubleC= Double.valueOf(formatC);
        System.out.println("doubleC = " + doubleC);
















    }
}
