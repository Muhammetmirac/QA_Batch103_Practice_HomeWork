package PracticeAdvanced.practice07;

import java.util.Arrays;

public class Q01_ArrayToStringNegative {
    /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
                                                                                                        */
    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String str = "";
        for (String w:arr         ) {
            str +=w;
        }
        System.out.println(str);
        str =str.replace("Is","IsNot");
        System.out.println(str);






    }
}