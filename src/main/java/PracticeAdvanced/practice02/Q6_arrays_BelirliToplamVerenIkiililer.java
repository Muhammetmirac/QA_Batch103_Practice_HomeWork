package PracticeAdvanced.practice02;

public class Q6_arrays_BelirliToplamVerenIkiililer {

    /*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */
    public static void main(String[] args) {
        int arr[] = new int[]{4, 6, 5, -10, 8, 5, 20};

ikilileriBul(arr,10);


//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i]+arr[j]==10){
//
//                    System.out.println(""+arr[i]+" and"+arr[j]);
//                }
//            }
//
//
//        }

    }

    public static void ikilileriBul(int[]arr,int a){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==a){
                    System.out.println(arr[i] + "+"+ arr[j]+ " = "+ a);
                }

            }
        }
    }
}