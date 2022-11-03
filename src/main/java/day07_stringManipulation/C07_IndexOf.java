package day07_stringManipulation;

public class C07_IndexOf {
    public static void main(String[] args) {

         /*
           String str = "Kara kara dusunme Ankara";
        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);//5


        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("kara");//20 bastan Ankara'nin kara'si
        System.out.println(idxA2);
         */


        //Ex: Verilen bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz

        String str = "Java can candir";



        char ch = 'J';

        if (str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.println("Tekrarsız");
        }else
            System.out.println("Tekrarli");


        String str2 = "12344555";
        char ch2 ='4';

        if (str2.indexOf(ch2)==str2.lastIndexOf(ch2)){
            System.out.println("Tekrarsız");
        }else
            System.out.println("Tekrarli");




    }
}