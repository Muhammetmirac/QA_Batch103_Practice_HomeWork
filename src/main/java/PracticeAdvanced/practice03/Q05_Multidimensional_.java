package PracticeAdvanced.practice03;

public class Q05_Multidimensional_ {
    public static void main(String[] args) {

    /*

 Aşağıdaki mutli dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
 toplamını yazdıran bir program yazın.
 arr1[]={{1,2},{3,4,5}{6}}
 arr2[]={{7,8,9},{10,11},{12}}
                                                                                                                */
       int arr1[][]={{1,2},{3,4,5},{6}};
       int arr2[][]={{7,8,9},{10,11},{12}};

       int uzunluk = 0;
       int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {
            uzunluk = arr1[i].length;
            if (arr1[i].length>arr2[i].length){
                uzunluk=arr2[i].length;
            }
            for (int j = 0; j < uzunluk; j++) {
                toplam = arr1[i][j]+arr2[i][j];
                System.out.println("arr["+i+"]["+j+"] = " + toplam);

            }
        }












    }
}