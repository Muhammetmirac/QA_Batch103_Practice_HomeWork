package PracticeAdvanced.practice04;

public class Q05_StringBuilder_Palindrom {
    public static void main(String[] args) {
        ////Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.


        String str ="nazan";
        String strReverse ="";
        for (int i = str.length()-1; i >-1 ; i--) {
            strReverse+=str.charAt(i);

        }
        System.out.println("strReverse = " + strReverse);

        if (str.equalsIgnoreCase(strReverse)){
            System.out.println("palindromdur");
        }else {
            System.out.println("Palindrome değil");
        }

        //2.yol StringBUilder ile

        String dizi="nazan";
        StringBuilder stb = new StringBuilder(dizi);
        String tersten = stb.reverse().toString();
        System.out.println(stb);
        System.out.println("tersten = " + tersten);
        if (stb.equals(tersten)){
            System.out.println("palindromdur");
        }else {
            System.out.println("Palindrome değil");
        }

/*
   String str = "nazan1";
        StringBuilder stb = new StringBuilder(str);
        String stbReverse = stb.reverse().toString();

        if (str.equals(stbReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }
 */








    }
}
